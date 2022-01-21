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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private Stage primaryStage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField UserFieldLogin;
    @FXML
    private TextField PasswordFieldLogin;


    @FXML
    void SignUp(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,400, 600);
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void SignIn(ActionEvent event) {
        //Read File
        File f = new File("Users.txt");
        try{
            Scanner myReader = new Scanner(f);
            boolean flag = false;
            while (myReader.hasNextLine()){
                myReader.nextLine();
                if(UserFieldLogin.getText().equals(myReader.nextLine())){
                    myReader.nextLine();
                    if(PasswordFieldLogin.getText().equals(myReader.nextLine())) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                try {
                    root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
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
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("The username and password aren't match!");
                alert.show();
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
