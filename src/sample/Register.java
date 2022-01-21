package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.*;

public class Register {
    private Stage primaryStage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField UserField;
    @FXML
    private TextField PasswordField;

    @FXML
    void SignIn(ActionEvent event) {
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
    void SignUp(ActionEvent event) {
        try(FileWriter fw = new FileWriter("Users.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("Username :");
            out.println(UserField.getText());
            out.println("Password : ");
            out.println(PasswordField.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("\""+UserField.getText() + "\" Registered Successfully.");
            alert.show();
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

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
