package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label labelka = new Label();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {

        JsonFileReader.readJsonFile("/city_names.json");
        labelka.setText("Działa");

        } catch (Exception e) {
            labelka.setText("NIEEEE DZIALA");
            e.printStackTrace();
        }
    }
}
