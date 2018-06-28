package com.battleships.start_window;

import com.battleships.Translator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class CountAdjusterWindow extends InitFromStartWindow {
    // Count Progress Bars // TODO try to group these 3 elements to a new class
    @FXML
    private Label rowsTextLabel;
    @FXML
    private Slider rowsProgressBar;
    @FXML
    private Label rowsAmountDisplayer;


    @FXML
    private Label columnsTextLabel;
    @FXML
    private Slider columnsProgressBar;
    @FXML
    private Label columnsAmountDisplayer;

    public CountAdjusterWindow() {
//        initRowsProgressBar();
//        initColumnsProgressBar();
    }

    private void initRowsProgressBar() {
        Translator.bind(rowsTextLabel, "row_count");
        rowsProgressBar.valueProperty().addListener
                ((observableValue, oldValue, newValue) -> rowsAmountDisplayer.setText(String.valueOf(newValue.intValue())));
    }

    private void initColumnsProgressBar() {
        Translator.bind(columnsTextLabel, "columns_count");
        columnsProgressBar.valueProperty().addListener
                ((observableValue, oldValue, newValue) -> columnsAmountDisplayer.setText(String.valueOf(newValue.intValue())));
    }
}
