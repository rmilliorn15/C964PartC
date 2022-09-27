package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.VideoGame;
import model.filterCsv;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Results implements Initializable {
    public TextField resultsText;
    public TextArea gameDescript;



    public void nextButton(ActionEvent actionEvent) {
    }

    public void restartButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Click start to begin.");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        }

}
