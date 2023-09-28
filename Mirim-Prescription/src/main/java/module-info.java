module com.emirim.mirimprescription {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.emirim.mirimprescription to javafx.fxml;
    exports com.emirim.mirimprescription;
}