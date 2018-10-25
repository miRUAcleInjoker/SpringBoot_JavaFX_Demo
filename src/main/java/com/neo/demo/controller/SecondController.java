package com.neo.demo.controller;

import com.neo.demo.pojo.User;
import com.neo.demo.service.UserService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;

@FXMLController
public class SecondController {
    @Autowired
    private UserService userService;
    @FXML
    private Button btn_test;
    @FXML
    private TableView<User> tv_test = new TableView<>();

    public void click(javafx.event.ActionEvent actionEvent) {
        System.out.println("into test");
        ObservableList<User> users = userService.getAll();
        for (User u : users) {
            System.out.println(u.toString());
        }
        System.out.println(tv_test.getColumns().get(0).getText());
//        tv_test = new TableView<User>();
//        列表字段与实体类属性一一映射
        tv_test.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("username"));
        tv_test.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("password"));
//        TableView装配数据
        tv_test.setItems(userService.getAll());
    }
}
