package com.neo.demo.service.impl;

import com.neo.demo.pojo.User;
import com.neo.demo.service.UserService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /*
     * 0=账户不存在；
     * 1=登陆成功；
     * 2=密码错误*/
    @Override
    public int login(User user) {
        if (user.getUsername().equals("wf")) {
            if (user.getPassword().equals("1")) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
    }

    @Override
    public ObservableList<User> getAll() {
        ObservableList<User> users = FXCollections.observableArrayList();
        users.add(new User("wf", "1"));
        users.add(new User("fw", "2"));
        users.add(new User("qq", "3"));

        return users;
    }
}
