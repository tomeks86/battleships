package com.battleships.start_window;

import com.battleships.Translator;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Locale;

public class StartWindow {
    @FXML
    private InsertDataController insertDataController;
//    @FXML
//    private CountAdjusterWindow countAdjusterWindow;

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
    private Label languageLabel;

    public void initialize() {
        Translator.bind(settingsLabel, "choose_settings");
        Translator.bind(selectRoom, "select_room");
        Translator.bind(createRoom, "create_room");
        Translator.bind(roomListLabel, "room_list");
        Translator.bind(languageLabel, "language");
//        insertDataController.init(this);
//        countAdjusterWindow.init(this);
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
