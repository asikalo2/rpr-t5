package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField numberField;

    public void add1Action(ActionEvent actionEvent) {
        numberField.setText(numberField.getText().concat("1"));
    }

    public void add2Action(ActionEvent actionEvent) {
        numberField.setText(numberField.getText().concat("2"));
    }

    public void add3Action(ActionEvent actionEvent) {
        numberField.setText(numberField.getText().concat("3"));
    }

    public void calculateAction(ActionEvent actionEvent) {
        // Do calculate
    }
}
