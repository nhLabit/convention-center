package com.spring26.section2.group16.conventioncenter.user5;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.U5G2;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class goal2Controller
{
    @javafx.fxml.FXML
    private TableView<U5G2> eventsTableView;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn<U5G2,String> EventNameCol;
    @javafx.fxml.FXML
    private TableColumn<U5G2, DatePicker> Datecol;
    @javafx.fxml.FXML
    private TableColumn<U5G2,String> HallCol;

    //private List<U5G2> data = new ArrayList<>();
    private List<U5G2> databaseArray5 = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        //HallCol.getCellValueFactory().addAll("Weeding Hall","Seminar Hall");
        //HallCol.setCellValueFactory(new PropertyValueFactory<>("HallName"));


        //selectServiceCB.getItems().addAll("Only Hall", "Hall+Food", "Hall+Food+Staff");

        //servicesCol.setCellValueFactory(new PropertyValueFactory<>("hallName"));
        //capacityCol.setCellValueFactory(new PropertyValueFactory<>("hallCapacity"));
        //serviceTV.getItems().addAll(databaseArray3);

    }

    @javafx.fxml.FXML
    public void searchOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewDetailsOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user5Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    public TableColumn<U5G2, DatePicker> getDatecol() {
        return Datecol;
    }

    public void setDatecol(TableColumn<U5G2, DatePicker> datecol) {
        Datecol = datecol;
    }
}