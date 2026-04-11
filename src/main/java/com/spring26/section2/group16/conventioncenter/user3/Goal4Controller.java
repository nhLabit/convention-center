package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Goal4Controller
{
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TextField userNameField;
    @javafx.fxml.FXML

    private PasswordField passwordField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;

    private List<Database> databaseArray1 = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Admin", "Customer", "Guest", "Developer");


    }

    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void addUserOnClick(ActionEvent actionEvent) {
        if (userNameField.getText().isEmpty() || passwordField.getText().isEmpty() ||
        roleComboBox.getValue().isEmpty()){
            labelL.setText("Field Can't be Empty");
            return;
        }
        Database d = new Database(roleComboBox.getValue(),
                userNameField.getText(),
                passwordField.getText());

        databaseArray1.add(d);
        labelL.setText("Congratulations! Success");
        System.out.println(d);


    }
}