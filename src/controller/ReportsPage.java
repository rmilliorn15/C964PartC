package controller;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.VideoGame;
import model.trackChoices;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReportsPage implements Initializable {
    public BarChart<String,Integer> pickedChart;
    public PieChart totalPieChart;
    public BarChart matchesBarChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Integer> series1 = new XYChart.Series();
        series1.setName("Genres picked by user");
        series1.getData().add(new XYChart.Data<>("Action", trackChoices.getPickAction()));
        series1.getData().add(new XYChart.Data<>("Adventure", trackChoices.getPickAdventure()));
        series1.getData().add(new XYChart.Data<>("Comedy", trackChoices.getPickComedy()));
        series1.getData().add(new XYChart.Data<>("Crime", trackChoices.getPickCrime()));
        series1.getData().add(new XYChart.Data<>("Family", trackChoices.getPickFamily()));
        series1.getData().add(new XYChart.Data<>("SciFi", trackChoices.getPickSciFi()));
        series1.getData().add(new XYChart.Data<>("Fantasy", trackChoices.getPickFantasy()));
        series1.getData().add(new XYChart.Data<>("Mystery", trackChoices.getPickMystery()));
        series1.getData().add(new XYChart.Data<>("Thriller", trackChoices.getPickThriller()));

        pickedChart.getData().addAll(series1);


        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Action", VideoGame.getAct()),
                new PieChart.Data("Adventure",VideoGame.getAdv()),
                new PieChart.Data("Comedy", VideoGame.getCom()),
                new PieChart.Data("Crime",VideoGame.getCri()),
                new PieChart.Data("Family", VideoGame.getFam()),
                new PieChart.Data("Fantasy",VideoGame.getFan()),
                new PieChart.Data("SciFi", VideoGame.getSci()),
                new PieChart.Data("Mystery", VideoGame.getMys()),
                new PieChart.Data("Thriller", VideoGame.getThr()));

        pieChartData.forEach(data -> data.nameProperty().bind(Bindings.concat(
                data.getName(),": ", data.pieValueProperty())
        ));

        totalPieChart.getData().addAll(pieChartData);



        XYChart.Series<String, Integer> series2 = new XYChart.Series();
        series2.setName("Number of games matching selections");
        series2.getData().add(new XYChart.Data<>("First Choice " + trackChoices.getNumGames1(),  trackChoices.getNumGames1()));
        series2.getData().add(new XYChart.Data<>("Second Choice " + trackChoices.getNumGames2(), trackChoices.getNumGames2()));
        series2.getData().add(new XYChart.Data<>("Third Choice " + trackChoices.getNumGames3(), trackChoices.getNumGames3()));
        series2.getData().add(new XYChart.Data<>("Fourth Choice " + trackChoices.getNumGames4(), trackChoices.getNumGames4()));
        series2.getData().add(new XYChart.Data<>("Fifth Choice " + trackChoices.getNumgames5(), trackChoices.getNumgames5()));



        matchesBarChart.getData().addAll(series2);





    }

    public void backButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Welcome, Click start to begin.");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
