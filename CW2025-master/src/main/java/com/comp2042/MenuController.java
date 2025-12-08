package com.comp2042;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class MenuController {

    private Stage primaryStage;

    public void setStage(Stage stage) {
        this.primaryStage = stage;
    }

    @FXML
    private void startGame() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("gameLayout.fxml"));
            Parent root = fxmlLoader.load();
            GuiController c = fxmlLoader.getController();

            Scene Gamescene = new Scene(root, 1000, 750);
            primaryStage.setScene(Gamescene);
            primaryStage.show();
            new GameController(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
