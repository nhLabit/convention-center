package com.spring26.section2.group16.conventioncenter.user6;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class goal8Controller
{
    @javafx.fxml.FXML
    private TableView GeneratePaymentReportTableView;
    @javafx.fxml.FXML
    private TableColumn UserNameCol;
    @javafx.fxml.FXML
    private TableColumn AmountCol;
    @javafx.fxml.FXML
    private DatePicker FromDatePicker;
    @javafx.fxml.FXML
    private DatePicker ToDatePicker;
    @javafx.fxml.FXML
    private TableColumn DateCol;
    @javafx.fxml.FXML
    private TableColumn PaymentIDCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void DownloadReportOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user6Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void GenerateReportOnClick(ActionEvent actionEvent) {
    }
}