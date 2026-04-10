package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal3Controller
{
    @javafx.fxml.FXML
    private Label lableL;
    @javafx.fxml.FXML
    private ComboBox hallCB;
    @javafx.fxml.FXML
    private TableColumn hallNameCol;
    @javafx.fxml.FXML
    private TableView hallTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void doneOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}