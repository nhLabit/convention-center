package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal4Controller
{
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private ComboBox hallCB;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TextField guestTF;

    @javafx.fxml.FXML
    public void initialize() {

        hallCB.getItems().addAll("Multipurpose Hall", "Auditorium");
    }

    @Deprecated
    public void doneOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editOnClick(ActionEvent actionEvent) {
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