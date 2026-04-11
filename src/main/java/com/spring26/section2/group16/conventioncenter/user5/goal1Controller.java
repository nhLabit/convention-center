package com.spring26.section2.group16.conventioncenter.user5;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class goal1Controller
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private DatePicker eventDatedatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> hallCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        hallCombobox.getItems().addAll("Main Auditorium","VIP Hall","Seminar Room","Wedding Hall","Meeting Room");
    }

    @javafx.fxml.FXML
    public void savebuttonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelbuttonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user5Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}