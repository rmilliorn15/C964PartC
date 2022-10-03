package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VideoGame {
    private int id;
    private String title;
    private String year;
    private String description;
    public boolean action;
    public boolean adventure;
    public boolean comedy;
    public boolean crime;
    public boolean family;
    public boolean mystery;
    public boolean thriller;
    public boolean sciFi;
    public boolean fantasy;
    private static int act = 0;
    private static int adv = 0;
    private static int cri = 0;
    private static int fam = 0;
    private static int com = 0;
    private static int fan = 0;
    private static int mys = 0;
    private static int sci = 0;
    private static int thr = 0;
    public static ObservableList<VideoGame> videoGames = FXCollections.observableArrayList();

    public VideoGame(int id, String title, String year, String description, boolean action, boolean adventure,
                     boolean comedy, boolean crime, boolean family, boolean fantasy, boolean mystery, boolean sciFi,
                     boolean thriller) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.description = description;
        this.action = action;
        this.adventure =adventure;
        this.comedy = comedy;
        this.crime = crime;
        this.family = family;
        this.mystery = mystery;
        this.thriller = thriller;
        this.sciFi = sciFi;
        this.fantasy = fantasy;

    }

    public int getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAction() {
        return action;
    }

    public boolean isAdventure() {
        return adventure;
    }

    public boolean isComedy() {
        return comedy;
    }

    public boolean isCrime() {
        return crime;
    }

    public boolean isFamily() {
        return family;
    }

    public boolean isFantasy() {
        return fantasy;
    }

    public boolean isMystery() {
        return mystery;
    }

    public boolean isSciFi() {
        return sciFi;
    }

    public boolean isThriller() {
        return thriller;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public void setAdventure(boolean adventure) {
        this.adventure = adventure;
    }

    public void setComedy(boolean comedy) {
        this.comedy = comedy;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public void setFantasy(boolean fantasy) {
        this.fantasy = fantasy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMystery(boolean mystery) {
        this.mystery = mystery;
    }

    public void setSciFi(boolean sciFi) {
        this.sciFi = sciFi;
    }

    public void setThriller(boolean thriller) {
        this.thriller = thriller;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    static void addVideoGame(VideoGame videoGame){
        videoGames.add(videoGame);
    }

    public static boolean deleteVideoGame(VideoGame selectedVideoGame){
        if (videoGames.contains(selectedVideoGame)){
            videoGames.remove(selectedVideoGame);
            return true;
        }
        else {
            return false;
        }
    }

    public static ObservableList<VideoGame> getVideoGames() {
        return videoGames;
    }

    public static void setGenres(){
        for (VideoGame game : videoGames){
            if (game.isAction()){
                act++;
            }
            if (game.isAdventure()){
                adv++;
            }
            if (game.isComedy()){
                com++;
            }
            if (game.isCrime()){
                cri++;
            }
            if (game.isFantasy()){
                fan++;
            }
            if (game.isFamily()){
                fam++;
            }
            if (game.isSciFi()){
                sci++;
            }
            if (game.isMystery()){
                mys++;
            }
            if (game.isThriller()){
                thr++;
            }

        }
    }

    public static int getAct() {
        return act;
    }

    public static int getAdv() {
        return adv;
    }

    public static int getCom() {
        return com;
    }

    public static int getCri() {
        return cri;
    }

    public static int getFan() {
        return fan;
    }

    public static int getFam() {
        return fam;
    }

    public static int getSci() {
        return sci;
    }

    public static int getMys() {
        return mys;
    }

    public static int getThr() {
        return thr;
    }
}
