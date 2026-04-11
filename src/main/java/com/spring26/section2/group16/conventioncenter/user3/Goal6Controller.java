package com.spring26.section2.group16.conventioncenter.user3;

import com.spring26.section2.group16.conventioncenter.HelloApplication;
import com.spring26.section2.group16.conventioncenter.NonUser.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Goal6Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> roleCB;
    @javafx.fxml.FXML
    private ListView<String> infoLV;
    @javafx.fxml.FXML
    private Label labelL;

    private List<Database> databaseArray4 = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        roleCB.getItems().addAll("Admin", "Developer");
    }

    @javafx.fxml.FXML
    public void saveOnClick(ActionEvent actionEvent) {
        String category = roleCB.getValue();

        if (roleCB.equals("Admin")) {
            for (Database d : databaseArray4){
     //           if (d.getRoleName().equals("Admin");
            }
            labelL.setText("Admin can assign role" +
                    "Permission change" + "System control");{
                        infoLV.getItems().addAll();
            }
        }
        if (roleCB.equals("Developer")) {
            infoLV.setAccessibleText("Developer Developer role manage" + "System settings");
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
