package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.VideoGame;
import model.filterCsv;

import java.io.IOException;

import static controller.Secondpage.filteredGame2;

public class Comedy {
    public static ObservableList<VideoGame> filteredGame3 = FXCollections.observableArrayList();
    private void filterGameComedy(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : filteredGame2) {
            if (videoGame.isComedy() == filterCsv.isComedy()) {
                filteredGame3.add(videoGame);
            }
        }
        System.out.println(filteredGame3.size());

        Parent root = FXMLLoader.load(getClass().getResource("/view/fantasySciFi.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Fantasy or Sci-Fi?");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void yesButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setComedy(true);
        filterGameComedy(actionEvent);
    }



    public void noButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setComedy(false);
        filterGameComedy(actionEvent);
    }
}
