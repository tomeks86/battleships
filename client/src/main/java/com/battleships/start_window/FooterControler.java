package com.battleships.start_window;

import com.battleships.Translator;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.Locale;

public class FooterControler {
    @FXML
    private ChoiceBox<String> languageSelector;

    @FXML public void initialize(){
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
