package com.rpg.rpg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage stage) {
        //
        JFrame windows = new JFrame();
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setResizable(false);
        windows.setTitle("RPG");

        GamePanel gamePanel = new GamePanel();
        windows.add(gamePanel);

        windows.pack();

        windows.setLocationRelativeTo(null);
        windows.setVisible(true);

        gamePanel.startGameThread();
    }

    public static void main(String[] args) {
        launch();
    }
}