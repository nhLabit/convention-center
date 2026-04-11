package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Browser;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import com.spring26.section2.group16.conventioncenter.NonUser.U4G1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.String;

public class Goal1Controller {


    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TableView<U4G1> serviceTV;
    @FXML
    private ComboBox<String> selectServiceCB;
    @javafx.fxml.FXML
    private TableColumn<U4G1, String> servicesCol;

    private List<U4G1> databaseArray3 = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<U4G1, Integer> capacityCol;


    @javafx.fxml.FXML
    public void initialize() {

        selectServiceCB.getItems().addAll("Only Hall", "Hall+Food", "Hall+Food+Staff");

        servicesCol.setCellValueFactory(new PropertyValueFactory<>("hallName"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<>("hallCapacity"));
        serviceTV.getItems().addAll(databaseArray3);

    }


    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user4Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();

    }

    @FXML
    public void loadOnClick(ActionEvent actionEvent) {
//        if (selectServiceCB.getValue()== null || selectServiceCB.getValue().isEmpty()){
//            labelL.setText("Select a Service First");
//            return;


        String selected = selectServiceCB.getValue();

        if (selectServiceCB.equals("hall")) {
            serviceTV.getItems().add(new U4G1("Hall 1", 1000));
            return;
        }

        if (selectServiceCB.equals("hall+food")) {
            serviceTV.getItems().add(new U4G1("Hall 2", 500));
            return;
        }

        if (selectServiceCB.equals("hall+food+staff")) {
            serviceTV.getItems().add(new U4G1("Hall 3", 450));
            return;
        }

        if (selectServiceCB.getValue() == null || selectServiceCB.getValue().isEmpty()) {
            labelL.setText("Select a Service First");
            return;


//        if (selectServiceCB.equals("hall")) {
//                serviceTV.getItems().add(new U4G1("Hall 1", 1000));
//                return;


            //String selected = selectServiceCB.getValue();

//            if (selected.equals("hall")) {
//                serviceTV.getItems().add(new Database("okk", "Hall 1", "kk"));
//                return;
//            }

//        if (selectServiceCB.getValue().isEmpty()){
//            labelL.setText("Select a Service First");
//            return;


        }
    }
}
//}