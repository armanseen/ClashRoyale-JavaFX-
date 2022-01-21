package sample.Pages;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Battle_History {
    private Stage primaryStage;
    private Scene scene;
    private Parent root;


    @FXML
    void Back(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("..\\MainPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Main Page");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
