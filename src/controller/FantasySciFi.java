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

import static controller.Comedy.filteredGame3;
import static model.VideoGame.videoGames;

public class FantasySciFi {

    public static ObservableList<VideoGame> filteredGame4 = FXCollections.observableArrayList();
    private void filteredListMethod(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : filteredGame3) {
            if (videoGame.isSciFi() == filterCsv.isSciFi() && videoGame.isFantasy() == filterCsv.isFantasy()) {
                filteredGame4.add(videoGame);
            }
        }

        if (filteredGame4.isEmpty()){
            System.out.println("No Matching game, continuing from last available list. ");
            filteredGame4 = filteredGame3;
        }


        Parent root = FXMLLoader.load(getClass().getResource("/view/lastQuestion.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Mystery or thriller?");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void fantasyButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setFantasy(true);
        filterCsv.setSciFi(false);
        filteredListMethod(actionEvent);
        trackChoices.setPickFantasy(trackChoices.getPickFantasy() + 1);

    }

    public void sciFiButton(ActionEvent actionEvent) throws IOException {
        filterCsv.setSciFi(true);
        filterCsv.setFantasy(false);
        filteredListMethod(actionEvent);
        trackChoices.setPickSciFi(trackChoices.getPickSciFi() + 1);
    }

    public void neitherButton(ActionEvent actionEvent) throws IOException {
        filterCsv.setSciFi(false);
        filterCsv.setFantasy(false);
        filteredListMethod(actionEvent);
    }
}
