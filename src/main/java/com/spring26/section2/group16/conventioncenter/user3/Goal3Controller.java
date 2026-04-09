package com.spring26.section2.group16.conventioncenter.user3;

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

public class Goal3Controller
{
    @javafx.fxml.FXML
    private TableView UserListTV;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private ComboBox filterDataCB;
    @javafx.fxml.FXML
    private TableColumn roleCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterOnClick(ActionEvent actionEvent) {
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