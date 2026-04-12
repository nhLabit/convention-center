package com.spring26.section2.group16.conventioncenter.user1;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Goal3Controller {

    @FXML
    private Label totalLabel;
    @FXML
    private TextField cateringCostField;
    @FXML
    private TextField hallPriceField;

    @FXML
    public void initialize() {
    }

    @FXML
    public void returnToDashboardOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardOfUsers/user1Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void generateQuoteOnClick(ActionEvent actionEvent) {
    }
    //
}