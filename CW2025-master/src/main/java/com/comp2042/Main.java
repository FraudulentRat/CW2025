package com.comp2042;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BGM.playMenuMusic();
        URL location = getClass().getClassLoader().getResource("mainMenu.fxml");
        ResourceBundle resources = null;
        FXMLLoader fxmlLoader = new FXMLLoader(location, resources);
        Parent root = fxmlLoader.load();
        
        MenuController menuController = fxmlLoader.getController();
        menuController.setStage(primaryStage);

        primaryStage.setTitle("TetrisJFX");
        String iconPath = getClass().getClassLoader().getResource("tetrix.jpg").toExternalForm();
        primaryStage.getIcons().add(new Image(iconPath));

        Scene scene = new Scene(root, 1000, 750);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
