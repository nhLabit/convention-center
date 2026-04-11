package com.spring26.section2.group16.conventioncenter.user1;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// ⚠️ IMPORTANT: Change "Goal1Controller" to match the file you are pasting this into (Goal2Controller, Goal3Controller, etc.)
public class Goal1Controller {

    // --- PASTE THE NEW FIELDS HERE ---
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
        // We will put your specific goal logic here later!
    }

    // --- PASTE THE NEW METHOD HERE ---
    @javafx.fxml.FXML
    public void saveLeadOnClick(javafx.event.ActionEvent actionEvent) {
        // Just a quick test to make sure it works when clicked
        statusLabel.setText("Success! Lead saved.");
    }

    @javafx.fxml.FXML
    public void returnToDashboardOnClick(javafx.event.ActionEvent event) throws java.io.IOException {
        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(HelloApplication.class.getResource("user1/goal1.fxml")); // Make sure this path is correct!
        javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
        javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
