package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.VideoGame;
import model.csvReader;

public class Main extends Application {


    /**
     * Launches main page with click start to begin.
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        csvReader.readCsvFile();
        VideoGame.setGenres();
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
        stage.setTitle("Welcome, Click start to begin.");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }
}
