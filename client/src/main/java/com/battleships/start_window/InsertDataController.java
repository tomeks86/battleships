package com.battleships.start_window;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InsertDataController extends InitFromStartWindow {
    @FXML
    private Button connectToServer;
    @FXML
    private TextField nameTextField;

    public InsertDataController() {
//        Translator.bind(connectToServer, "connect");
//        nameTextField.promptTextProperty().bind(Translator.createStringBinding("player_name"));
    }
}
