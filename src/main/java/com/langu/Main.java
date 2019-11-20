package com.langu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author 刘常禄
 * @version 1.0
 * @data 2019-11-19 20:29
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/Home.fxml"));
        Scene scene = new Scene(root);
//        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.setTitle("javaFx");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
