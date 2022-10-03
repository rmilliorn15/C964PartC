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
import model.trackChoices;

import java.io.IOException;

import static controller.StartPage.filteredGames;

public class Secondpage {

    private void filterGamesMethod(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : filteredGames) {
            if (videoGame.isCrime() == filterCsv.isCrime() && videoGame.isFamily() == filterCsv.isFamily()) {
                filteredGame2.add(videoGame);
            }
        }
        trackChoices.setNumGames2(filteredGame2.size());
        System.out.println(filteredGame2.size());


        Parent root = FXMLLoader.load(getClass().getResource("/view/comedy.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Want Comedy?");
        stage.setScene(new Scene(root));
        stage.show();
    }


    public static ObservableList<VideoGame> filteredGame2 = FXCollections.observableArrayList();
    public void crimeButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setCrime(true);
        filterCsv.setFamily(false);
        filterGamesMethod(actionEvent);
        trackChoices.setPickCrime(trackChoices.getPickCrime() + 1);


    }

    public void familyButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setCrime(false);
        filterCsv.setFamily(true);
        filterGamesMethod(actionEvent);
        trackChoices.setPickFamily(trackChoices.getPickFamily() + 1);
    }


    public void neitherButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setCrime(false);
        filterCsv.setFamily(false);
        filterGamesMethod(actionEvent);
    }
}
