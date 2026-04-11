package com.spring26.section2.group16.conventioncenter.user4;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal2Controller
{
    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private CheckBox anonymousCheckBox;
    @javafx.fxml.FXML
    private TextArea reviewTextArea;

    @javafx.fxml.FXML
    public void initialize() {


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
    public void submitOnClick(ActionEvent actionEvent) {

        String reviewText = reviewTextArea.getText();

        if (reviewText == null || reviewText.isEmpty()) {
            System.out.println("Please write a review!");
            return;
        }

        // checkbox check

        if (anonymousCheckBox.isSelected()) {
            System.out.println("Anonymous Review: " + reviewText);
            labelL.setText("Anonymous review done");

        } else {
            System.out.println("User Review: " + reviewText);
            labelL.setText("Review done with name");
        }

    }

    }
