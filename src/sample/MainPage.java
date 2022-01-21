package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.*;

public class MainPage {
    private Stage primaryStage;
    private Scene scene;
    private Parent root;
    @FXML
    void Exit(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void Battle_Deck(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/Battle_Deck.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Battle Deck");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void Battle_History(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/Battle_History.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Battle History");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void Training_Camp(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/Training_Camp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Training Camp");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void Profile(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/Profile.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Profile");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void OneVOne(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/OneVOne.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("1V1");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void TwoVTwo(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("Pages/TwoVTwo.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("2V2");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
