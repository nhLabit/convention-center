module com.spring26.section2.group16.conventioncenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group16.conventioncenter to javafx.fxml;
    exports com.spring26.section2.group16.conventioncenter;
}