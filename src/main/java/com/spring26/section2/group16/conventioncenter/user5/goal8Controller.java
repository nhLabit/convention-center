package com.spring26.section2.group16.conventioncenter.user5;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class goal8Controller
{
    @javafx.fxml.FXML
    private TableView EventTableView;
    @javafx.fxml.FXML
    private ComboBox<String> SelectHallCombox;
    @javafx.fxml.FXML
    private Label outputShowLabel;
    @javafx.fxml.FXML
    private TableColumn EventCol;

    @javafx.fxml.FXML
    public void initialize() {
        SelectHallCombox.getItems().addAll("Main Auditorium","VIP Hall","Seminar Room","Wedding Hall","Meeting Room");
    }

    @javafx.fxml.FXML
    public void SelectOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashboardOnClcik(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user5Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}