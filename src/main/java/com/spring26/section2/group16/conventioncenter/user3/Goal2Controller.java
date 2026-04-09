package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal2Controller
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox roleCB;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private Label labelL;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashBoardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}