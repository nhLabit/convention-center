package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Goal3Controller
{
    @javafx.fxml.FXML
    private TableView<Database> UserListTV;
    @javafx.fxml.FXML
    private TableColumn<Database, String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> filterDataCB;
    @javafx.fxml.FXML
    private TableColumn<Database, String> roleCol;

    private List<Database> databaseArray1 = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {

        filterDataCB.getItems().addAll("Admin", "Guest", "Customer", "Developer");

        nameCol.setCellValueFactory(new PropertyValueFactory<>("roleName"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));

        UserListTV.getItems().addAll(databaseArray1);
    }

    @javafx.fxml.FXML
    public void filterOnClick(ActionEvent actionEvent) {
        if (filterDataCB.getValue().equals("Customer")) {


    }


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