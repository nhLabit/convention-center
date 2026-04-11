module com.spring26.section2.group16.conventioncenter {
    requires javafx.controls;
    requires javafx.fxml;
    //requires com.spring26.section2.group16.conventioncenter;
    requires javafx.graphics;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    //requires com.spring26.section2.group16.conventioncenter;
    opens com.spring26.section2.group16.conventioncenter.user6 to javafx.fxml;
    opens com.spring26.section2.group16.conventioncenter to javafx.fxml;
    opens com.spring26.section2.group16.conventioncenter.user3 to javafx.fxml;
    opens com.spring26.section2.group16.conventioncenter.user4 to javafx.fxml;
    opens com.spring26.section2.group16.conventioncenter.user5 to javafx.fxml;
    opens com.spring26.section2.group16.conventioncenter.NonUser to javafx.base, javafx.fxml;

    exports com.spring26.section2.group16.conventioncenter;
}