package com.example.demo13;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController6 {
    @FXML
    private Button button;
    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    void goNext(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900, 600);
        stage.setTitle("stage 3");
        stage.setScene(scene);
    }

    @FXML
    void chat(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900, 600);
        stage.setTitle("stage 3");
        stage.setScene(scene);
    }

    @FXML
    void form(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello6-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900, 600);
        stage.setTitle("stage 3");
        stage.setScene(scene);
    }

    @FXML
    private Button button2;

    @FXML
    void goprev(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("stage 3");
        stage.setScene(scene);
    }
}