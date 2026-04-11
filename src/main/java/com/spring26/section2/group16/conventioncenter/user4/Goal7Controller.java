package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal7Controller
{
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TextField bookingIDTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dashBoardOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelBookingOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user4Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}