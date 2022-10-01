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

public class StartPage {
    private void filterGamesList(ActionEvent actionEvent) throws IOException {
        for (VideoGame videoGame : videoGames) {
            if (videoGame.isAction() == filterCsv.isAction() && videoGame.isAdventure() == filterCsv.isAdventure()) {
                filteredGames.add(videoGame);
            }
        }
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
    }



    public void adventureButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(false);
        filterCsv.setAdventure(true);
        filterGamesList(actionEvent);

    }


    public void bothButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(true);
        filterCsv.setAdventure(true);
        filterGamesList(actionEvent);
    }

    public void neitherButton(ActionEvent actionEvent) throws IOException {

        filterCsv.setAction(false);
        filterCsv.setAdventure(false);
        filterGamesList(actionEvent);
    }
}
