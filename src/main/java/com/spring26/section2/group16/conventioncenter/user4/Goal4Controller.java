package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.AppendableObjectOutputStream;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import com.spring26.section2.group16.conventioncenter.NonUser.U4G4;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Goal4Controller
{
    @javafx.fxml.FXML
    private TextField guestTF;
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField bookingID;
    @javafx.fxml.FXML
    private ComboBox<String> hallCB;

    private List<U4G4> databaseArray5 = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        hallCB.getItems().addAll("Hall 1", "Hall 2", "Hall 3");

    }

    @javafx.fxml.FXML
    public void bookingOnClick(ActionEvent actionEvent) {
        if (hallCB.getValue().isEmpty() || bookingID.getText().isEmpty() || dateDP.getValue() == null ||
        guestTF.getText().isEmpty()){
            labelL.setText("Field can't be empty");
            return;
        }

        //(int numberOfGuest, int bookingID, String hallName, LocalDate bookingDate)
        U4G4 i = new U4G4(Integer.parseInt(guestTF.getText()),
                Integer.parseInt(bookingID.getText()),
                hallCB.getValue(),
                dateDP.getValue());

        try {
            File teamFile = new File("booking.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (teamFile.exists()){
                fos = new FileOutputStream(teamFile, true);

                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(teamFile);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(i);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");;
        }



//        for (Database i : databaseArray5 ){
//            if (i.getBookingID().equals(bookingID.getText())){
//                labelL.setText("provide unique number");
//                return;



//int numberOfGuest, int bookingID, String hallName, LocalDate bookingDate)


    }

    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user4Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }
}