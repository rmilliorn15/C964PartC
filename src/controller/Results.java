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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static controller.Comedy.filteredGame3;
import static controller.FantasySciFi.filteredGame4;
import static controller.LastQuestion.lastGame;
import static controller.Secondpage.filteredGame2;
import static controller.StartPage.filteredGames;

public class Results implements Initializable {
    public TextField resultsText;
    public TextArea gameDescript;
    ObservableList<VideoGame> results = lastGame;
    int i = 1;



    public void nextButton(ActionEvent actionEvent) {
        if (i < results.size()) {
            resultsText.setText(results.get(i).getTitle());
            gameDescript.setText(results.get(i).getDescription());
            i++;
        }
        else {
            resultsText.setText("Sorry.");
            gameDescript.setText("We Are not able to provide a good match at this time.");
        }
    }

    public void restartButton(ActionEvent actionEvent) throws IOException {

        lastGame.clear();
        filteredGame4.clear();
        filteredGame3.clear();
        filteredGame2.clear();
        filteredGames.clear();
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Click start to begin.");
        stage.setScene(new Scene(root));
        stage.show();

    }
    public void mainMenuButton(ActionEvent actionEvent) throws IOException {
        lastGame.clear();
        filteredGame4.clear();
        filteredGame3.clear();
        filteredGame2.clear();
        filteredGames.clear();
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Welcome, Click start to begin.");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resultsText.setText(results.get(0).getTitle());
        gameDescript.setText(results.get(0).getDescription());
        System.out.println(results.size());


    }


}
