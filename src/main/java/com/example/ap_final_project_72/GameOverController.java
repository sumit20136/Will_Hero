package com.example.ap_final_project_72;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameOverController {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private Button yesButton, noButton;

    @FXML
    private void SaveGame() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SaveGame.fxml")));
        stage = (Stage) yesButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void MainMenu() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
        stage = (Stage) yesButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
