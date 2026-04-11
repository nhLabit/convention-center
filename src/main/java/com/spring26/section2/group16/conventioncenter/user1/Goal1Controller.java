package com.spring26.section2.group16.conventioncenter.user1;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Goal1Controller {


    @javafx.fxml.FXML
    private javafx.scene.control.TextField clientNameField;
    @javafx.fxml.FXML
    private javafx.scene.control.TextField phoneField;
    @javafx.fxml.FXML
    private javafx.scene.control.TextField guestsField;
    @javafx.fxml.FXML
    private javafx.scene.control.Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void saveLeadOnClick(javafx.event.ActionEvent actionEvent) {
        statusLabel.setText("Success! Lead saved.");
    }

    @javafx.fxml.FXML
    public void returnToDashboardOnClick(javafx.event.ActionEvent event) throws java.io.IOException {
        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(HelloApplication.class.getResource("dashboardOfUsers/user1Dashboard.fxml")); // Make sure this path is correct!
        javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
        javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
//
