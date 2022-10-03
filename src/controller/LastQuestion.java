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

import static controller.FantasySciFi.filteredGame4;

public class LastQuestion {

    public static ObservableList<VideoGame> lastGame = FXCollections.observableArrayList();
    private void lastFilterMethod(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : filteredGame4) {
            if (videoGame.isMystery() == filterCsv.isMystery() && videoGame.isThriller() == filterCsv.isThriller()) {
                lastGame.add(videoGame);
                trackChoices.setNumgames5(lastGame.size());
            }
        }

        if (lastGame.isEmpty()){
            System.out.println("Unfortunately no exact match found but you may like this Game.");
            lastGame = filteredGame4;
            trackChoices.setNumgames5(0);
        }


        Parent root = FXMLLoader.load(getClass().getResource("/view/results.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Action Or Adventure?");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void mysteryButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setMystery(true);
        filterCsv.setThriller(false);
        lastFilterMethod(actionEvent);
        trackChoices.setPickMystery(trackChoices.getPickMystery() + 1);
    }



    public void thrillerButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setMystery(false);
        filterCsv.setThriller(true);
        lastFilterMethod(actionEvent);
        trackChoices.setPickThriller(trackChoices.getPickThriller() + 1);


    }

    public void neitherButton(ActionEvent actionEvent) throws IOException {
        filterCsv.setMystery(false);
        filterCsv.setThriller(false);
        lastFilterMethod(actionEvent);
    }
}
