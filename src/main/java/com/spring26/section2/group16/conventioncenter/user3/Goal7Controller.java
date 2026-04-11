package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import com.spring26.section2.group16.conventioncenter.NonUser.U3G7;
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
import java.util.ArrayList;
import java.util.List;

public class Goal7Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> staffNameCB;
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private TableView<U3G7> staffNameTV;
    @javafx.fxml.FXML
    private TableColumn<U3G7, String> staffNameCol;

    private List<U3G7> userlistArray = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<U3G7, String> roleCol;

    @javafx.fxml.FXML
    public void initialize() {
        staffNameCB.getItems().addAll("Abdur Rahim", "Abdul Karim", "Polash", "Sishir");

        //dummy data to select a random staff from the list

        userlistArray.add(new U3G7("Abdur Rahim", "Admin"));
        userlistArray.add(new U3G7("Abdul Karim", "Staff"));
        userlistArray.add(new U3G7("Polash", "Developer"));
        userlistArray.add(new U3G7("Sishir", "Guest"));

        staffNameTV.getItems().addAll(userlistArray);

//
    }

    @javafx.fxml.FXML
    public void selectOnClick(ActionEvent actionEvent) {
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