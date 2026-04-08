package com.spring26.section2.group16.conventioncenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProjectLoginPageController {
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeComboBox.getItems().addAll(" Sales Executive", " Receptionist", " Admin", " Customer", " Event Manager", " Accountant", " Maintenance Service", " Catering Service", " Inventory Officer", " Security Officer");
    }

    @javafx.fxml.FXML
    public void signinOnClick(ActionEvent actionEvent) {
        String loginUserType = userTypeComboBox.getValue();
        if (loginUserType.equals("Admin")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("com/spring26/section2/group16/conventioncenter/user3.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }

        if (loginUserType.equals("Customer")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("com/spring26/section2/group16/conventioncenter/user4.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}