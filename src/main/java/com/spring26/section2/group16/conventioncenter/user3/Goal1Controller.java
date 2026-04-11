package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Goal1Controller
{


    @javafx.fxml.FXML
    private Label labelL;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private CheckBox assignTechnicianCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
        categoryCB.getItems().addAll("Electrical", "Mechanical", "Development");

    }


    @javafx.fxml.FXML
    public void dashboardOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardofUsers/user3Dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(dashboardScene);
        currentStage.show();
    }

    @javafx.fxml.FXML
    public void saveOnClick(ActionEvent actionEvent) {

            String category = categoryCB.getValue();
            boolean isChecked = assignTechnicianCheckBox.isSelected();

            if (category == null) {
                labelL.setText("Please select a category");
                return;
            }

            if (category.equals("Electrical")) {

                if (isChecked) {
                    labelL.setText("electrical working on progress and worker assigned");
                } else {
                    labelL.setText("electrical working on progress and no worker assigned");
                }
            }
        if (category.equals("Mechanical")) {

            if (isChecked) {
                labelL.setText("Mechanical working on progress and worker assigned");
            } else {
                labelL.setText("Mechanical working on progress and no worker assigned");
            }
        }
        if (category.equals("Development")) {

            if (isChecked) {
                labelL.setText("Development working on progress and worker assigned");
            } else {
                labelL.setText("Development working on progress and no worker assigned");
            }
        }

        }
    }



