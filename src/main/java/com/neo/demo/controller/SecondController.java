package com.neo.demo.controller;

import com.neo.demo.pojo.Device;
import com.neo.demo.pojo.User;
import com.neo.demo.service.DeviceService;
import com.neo.demo.service.UserService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class SecondController implements Initializable {
    private StringProperty stringProperty = new SimpleStringProperty();

    @Autowired
    private UserService userService;
    @Autowired
    private DeviceService deviceService;
    @FXML
    private Button btn_test;
    @FXML
    private Label lb_test;
    @FXML
    private TableView<User> tv_test = new TableView<>();

    public void click(javafx.event.ActionEvent actionEvent) {
        System.out.println("into test");
        Device device = deviceService.selectById("JHXNJNIMPWLG0002");
        System.out.println(device);
        ObservableList<User> users = userService.getAll();
        for (User u : users) {
            System.out.println(u.toString());
        }
        System.out.println(tv_test.getColumns().get(0).getText());
//        tv_test = new TableView<User>();
//        列表字段与实体类属性一一映射
//        tv_test.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("username"));
//        tv_test.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("password"));
//        TableView装配数据
        tv_test.setItems(userService.getAll());
        stringProperty.set("test1");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //初始化方法里做映射
        tv_test.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("username"));
        tv_test.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("password"));

        //bind
        lb_test.textProperty().bind(stringProperty);
    }

    public void btn2click(ActionEvent actionEvent) {
        stringProperty.set("test2");
    }
}
