package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal2Controller
{

    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TableView userListTV;
    @javafx.fxml.FXML
    private ComboBox userTypeCB;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableColumn userIDCol;
    @javafx.fxml.FXML
    private TableColumn roleCol;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll("Admin", "Guest", "Customer", "Developer");


        userIDCol.setCellValueFactory(new PropertyValueFactory<>());
        nameCol.setCellValueFactory(new PropertyValueFactory<>());
        roleCol.setCellValueFactory(new PropertyValueFactory<>());

    }


    @javafx.fxml.FXML
    public void dashBoardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void doneOnClick(ActionEvent actionEvent) {
    }
}