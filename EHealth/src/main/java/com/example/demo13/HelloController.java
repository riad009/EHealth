package com.example.demo13;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button button;

    @FXML
    private Button button10;




    @FXML
    void admin(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello10-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);


     stage.setTitle("stage 2");
       stage.setScene(scene);
       stage.show();
    }

    @FXML
    void goNext(MouseEvent event) throws IOException {
       Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("stage 2");
        stage.setScene(scene);
    }
}