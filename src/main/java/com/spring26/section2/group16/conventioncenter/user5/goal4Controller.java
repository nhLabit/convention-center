package com.spring26.section2.group16.conventioncenter.user5;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class goal4Controller
{
    @javafx.fxml.FXML
    private TableView deleteEventTableView;
    @javafx.fxml.FXML
    private TableColumn EventNameCol;
    @javafx.fxml.FXML
    private TableColumn DateCol;
    @javafx.fxml.FXML
    private TableColumn HallCol;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void DashboardOnclick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user5Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void CancelOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DeleteOnClick(ActionEvent actionEvent) {
    }
}