module MeteoMateoTest {

    requires javafx.fxml;
    requires javafx.controls;
    requires owm.japis;
    requires java.sql;
    requires gson;
    requires controlsfx;
    exports sample;
    //opens sample.controller to javafx.fxml;
    opens sample to javafx.fxml;


}