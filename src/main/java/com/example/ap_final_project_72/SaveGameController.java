package com.example.ap_final_project_72;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static com.example.ap_final_project_72.NewGameController.*;

public class SaveGameController {


    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private Button game1, game2, game3;

    private void MainMenu(Button button) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
        stage = (Stage) button.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private SaveData dataSave(){
        SaveData data = new SaveData();
        data.setCoins(kcoins);
        data.setHeroX(kHeroX);
        data.setHeroY(kheroY);
        data.setOrc1X(kOrc1X);
        data.setOrc2X(kOrc2X);
        data.setOrc3X(kOrc3X);
        data.setOrc4X(kOrc4X);
        data.setOrc5X(kOrc5X);
        data.setPoints(kpoints);
        data.setKmode(kmode);
        data.setKsteps(ksteps);
        return data;
    }

    @FXML
    private void game1Save() throws Exception {
        new FileWriter("Game1", false).close();
        SaveData data = dataSave();
        ResourceManager.save(data, "Game1");
        MainMenu(game1);


    }
    @FXML
    private void game2Save() throws Exception {
        new FileWriter("Game2", false).close();
        SaveData data = dataSave();
        ResourceManager.save(data, "Game2");
        MainMenu(game2);

    }
    @FXML
    private void game3Save() throws Exception {
        new FileWriter("Game3", false).close();
        SaveData data = dataSave();
        ResourceManager.save(data, "Game3");
        MainMenu(game3);

    }
}
