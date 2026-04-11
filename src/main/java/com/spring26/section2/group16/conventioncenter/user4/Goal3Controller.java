package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.U4G4;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Goal3Controller
{
    @javafx.fxml.FXML
    private TableColumn<U4G4, String> hallNameCol;
    @javafx.fxml.FXML
    private TableColumn<U4G4, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableView<U4G4> listTV;
    @javafx.fxml.FXML
    private TableColumn<U4G4, Integer> guestCol;

    private List<U4G4> bookingListArray = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        //(int numberOfGuest, int bookingID, String hallName, LocalDate bookingDate)
        dateCol.setCellValueFactory(new PropertyValueFactory<>("bookingDate"));
        hallNameCol.setCellValueFactory(new PropertyValueFactory<>("hallName"));
        guestCol.setCellValueFactory(new PropertyValueFactory<>("numberOfGuest"));




    }



    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user4Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void loadOnClick(ActionEvent actionEvent) {
        File file = new File("booking.bin");
        if (!file.exists()) {
            System.out.println("File not found, returning empty list.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    U4G4 m1 = (U4G4) ois.readObject();
                    bookingListArray.add(m1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
        listTV.getItems().addAll(bookingListArray);
    }
}