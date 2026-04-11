package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Goal2Controller
{

    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TableView<Database> userListTV;
    @javafx.fxml.FXML
    private ComboBox <String>userTypeCB;
    @javafx.fxml.FXML
    private TableColumn<Database, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Database, Integer> userIDCol;
    @javafx.fxml.FXML
    private TableColumn <Database, String>roleCol;

    private List<Database> databaseArray2 = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll("Admin", "Guest", "Customer", "Developer");
       // int userID, int hallCapacity, String maintenanceCategory,
             //   String hallName, String roleName, String staffName,
            //    String serviceName, String reviewerName, String userRole, String userName, LocalDate
       // bookingDate

        userIDCol.setCellValueFactory(new PropertyValueFactory<>("userID"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("roleName"));

        userListTV.getItems().addAll(databaseArray2);

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