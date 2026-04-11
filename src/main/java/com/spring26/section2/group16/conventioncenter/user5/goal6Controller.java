package com.spring26.section2.group16.conventioncenter.user5;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class goal6Controller
{
    @javafx.fxml.FXML
    private TableColumn AvailableStaffCol;
    @javafx.fxml.FXML
    private ComboBox<String> SelectEventComboBox;
    @javafx.fxml.FXML
    private TableView AvaiableStafftableView;

    @javafx.fxml.FXML
    public void initialize() {
        SelectEventComboBox.getItems().addAll("Wedding Ceremony","Birthday Party","Corporate Meeting","Seminar","Music Concert");
    }

    @javafx.fxml.FXML
    public void BackOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AssignOnClick(ActionEvent actionEvent) {
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