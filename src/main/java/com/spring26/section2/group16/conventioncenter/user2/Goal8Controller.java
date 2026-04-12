package com.spring26.section2.group16.conventioncenter.user2;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

// ⚠️ IMPORTANT: Change "Goal1Controller" to match the file you are pasting this into (Goal2Controller, Goal3Controller, etc.)
public class Goal8Controller {

    @FXML
    private Label alertStatus;
    @FXML
    private ComboBox alertTypeCombo;
    @FXML
    private PasswordField pinField;

    @FXML
    public void initialize() {
        // We will put your specific goal logic here later!
    }

    @FXML
    public void returnToDashboardOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardOfUsers/user2Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void broadcastAlertOnClick(ActionEvent actionEvent) {
    }
}
//