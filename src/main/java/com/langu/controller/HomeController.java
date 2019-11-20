package com.langu.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.io.IOException;


/**
 * @author 刘常禄
 * @version 1.0
 * @data 2019-11-19 20:30
 */
public class HomeController {

    @FXML
    private MenuItem menuItemNewFile;

    @FXML
    private TabPane tabPaneMain;

    private int counter = 0;

    @FXML
    protected void onAddNewFile(Event event) throws IOException {
        Tab tab = new Tab("新窗口" + (++counter));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Page1.fxml"));
        Parent content = fxmlLoader.load();
        tab.setContent(content);
        tabPaneMain.getTabs().add(tab);
        tabPaneMain.getSelectionModel().select(tab);
    }

}
