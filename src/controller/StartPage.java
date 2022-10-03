package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.VideoGame;
import model.filterCsv;
import model.trackChoices;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static controller.Comedy.filteredGame3;
import static controller.FantasySciFi.filteredGame4;
import static controller.LastQuestion.lastGame;
import static controller.Secondpage.filteredGame2;

public class StartPage implements Initializable {
    private void filterGamesList(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : videoGames) {
            if (videoGame.isAction() == filterCsv.isAction() && videoGame.isAdventure() == filterCsv.isAdventure()) {
                filteredGames.add(videoGame);
            }
        }
        trackChoices.setNumGames1(Math.min(videoGames.size(), 10000));
        System.out.println(videoGames.size());
        System.out.println(filteredGames.size());

        Parent root = FXMLLoader.load(getClass().getResource("/view/secondPage.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Crime or Family?");
        stage.setScene(new Scene(root));
        stage.show();
    }
    ObservableList<VideoGame> videoGames = VideoGame.getVideoGames();

    public static ObservableList<VideoGame> filteredGames = FXCollections.observableArrayList();


    public void actionButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(true);
        filterCsv.setAdventure(false);
        filterGamesList(actionEvent);
        trackChoices.setPickAction(trackChoices.getPickAction() + 1);

    }



    public void adventureButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(false);
        filterCsv.setAdventure(true);
        filterGamesList(actionEvent);
        trackChoices.setPickAdventure(trackChoices.getPickAdventure() + 1);
    }


    public void bothButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(true);
        filterCsv.setAdventure(true);
        filterGamesList(actionEvent);
        trackChoices.setPickAction(trackChoices.getPickAction() + 1);
        trackChoices.setPickAdventure(trackChoices.getPickAdventure() + 1);
    }

    public void neitherButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(false);
        filterCsv.setAdventure(false);
        filterGamesList(actionEvent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lastGame.clear();
        filteredGame4.clear();
        filteredGame3.clear();
        filteredGame2.clear();
        filteredGames.clear();

    }
}
