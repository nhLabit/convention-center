package com.spring26.section2.group16.conventioncenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectLoginPageController {
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeComboBox.getItems().addAll(" Sales Executive", " Receptionist", " Admin", " Customer", " Event Manager", " Accountant", " Maintenance Service", " Catering Service", " Inventory Officer", " Security Officer");
    }

    @javafx.fxml.FXML
    public void signinOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}




















//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProjectLoginPage.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();



