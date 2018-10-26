package com.neo.demo.controller;

import com.neo.demo.pojo.User;
import com.neo.demo.service.UserService;
import com.neo.demo.util.JavaFxViewUtil;
import com.neo.demo.view.SecondView;
import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.GUIState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class StartController implements Initializable {
    @Autowired
    private SecondView secondView;
    @Autowired
    private UserService userService;
    @FXML
    private Button btn_toSecond;
    @FXML
    private Button btn_login;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_password;
    @FXML
    private Label lb_flag;

    public void login(ActionEvent actionEvent) {
        System.out.println("btn_login clicked!");
        User user = new User(tf_username.getText().trim(), tf_password.getText().trim());
        System.out.println(user.toString());

        int flag;
        flag = userService.login(user);
        switch (flag) {
            case 0:
                lb_flag.setText("用户不存在");
                break;
            case 1:
                System.out.println("登录成功");
                lb_flag.setText("");
                GUIState.getStage().hide();
                JavaFxViewUtil.toNewStage("Second", "", secondView.getView());
                break;
            case 2:
                lb_flag.setText("密码错误");
                break;
            default:
                System.out.println("???");
        }

    }

    public void toSecond(ActionEvent actionEvent) {
        GUIState.getStage().hide();
        JavaFxViewUtil.toNewStage("Second", "", secondView.getView());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("正在initialize");
    }
}
