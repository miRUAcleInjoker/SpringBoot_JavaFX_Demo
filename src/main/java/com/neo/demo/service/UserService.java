package com.neo.demo.service;

import com.neo.demo.pojo.User;
import javafx.collections.ObservableList;

public interface UserService {

    /*登录*/
    int login(User user);

    ObservableList<User> getAll();

}
