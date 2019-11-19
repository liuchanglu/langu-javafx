package com.langu.controller;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


/**
 * @author 刘常禄
 * @version 1.0
 * @data 2019-11-19 20:30
 */
public class LoginController {


    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnExit;

    @FXML
    protected void onLoginAction(Event event) {

        System.out.println("用户名" + txtUserName.getText());
        System.out.println("密码" + txtPassword.getText());

        System.out.println("登录");
    }

    @FXML
    protected void onLoginOut(Event event) {
        Platform.exit();
    }

}
