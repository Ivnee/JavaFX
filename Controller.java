package HW;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.event.KeyListener;

public class Controller {
    @FXML
    public TextField Name;
    @FXML
    public TextArea out;
    @FXML
    public TextField in;

    public void Send(ActionEvent actionEvent) {
        out.appendText(Name.getText() + ":  \n" + in.getText() + " \n" );
        in.setText("");
    }

    public void Delete(ActionEvent actionEvent) {
        out.setText("");
    }

}
