package com.battleships.settings;

import com.battleships.Translator;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Locale;

public class Settings {
    @FXML
    private ChoiceBox<String> languageSelector;
    @FXML
    private Label settingsLabel;
    @FXML
    private Label roomListLabel;
    @FXML
    private Button createRoom;
    @FXML
    private Button selectRoom;
    @FXML
    private Button connectToServer;
    @FXML
    private Label rowsTextLabel;
    @FXML
    private Slider rowsProgressBar;
    @FXML
    private Label rowsAmountDisplayer;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label languageLabel;

    public void initialize() {
        Translator.bind(settingsLabel, "choose_settings");
        Translator.bind(selectRoom, "select_room");
        Translator.bind(createRoom, "create_room");
        Translator.bind(connectToServer, "connect");
        Translator.bind(roomListLabel, "room_list");
        Translator.bind(languageLabel, "language");
        Translator.bind(rowsTextLabel, "row_count");
        nameTextField.promptTextProperty().bind(Translator.createStringBinding("player_name"));


        rowsAmountDisplayer.setText("10");
        rowsProgressBar.setValue(10);
        rowsProgressBar.valueProperty().addListener
                ((observableValue, oldValue, newValue) -> rowsAmountDisplayer.setText(String.valueOf(Math.round(newValue.intValue()))));

        setupLanguageSelector();
    }

    private void setupLanguageSelector() {
        languageSelector.setItems(FXCollections.observableArrayList( "pl", "en"));
        languageSelector.getSelectionModel().selectedItemProperty().addListener((observable, oldV, newV) -> {
                    Translator.setLocale(new Locale(newV));
                }
        );
        languageSelector.getSelectionModel().selectFirst();
    }
}
