module com.atm.atm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.atm to javafx.fxml;
    exports com.atm;
}