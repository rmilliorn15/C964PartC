package model;

public class trackChoices {
    private static int pickAction = 0;
    private static int pickAdventure = 0;
    private static int pickComedy = 0;
    private static int pickCrime = 0;
    private static int pickFamily = 0;
    private static int pickFantasy = 0;
    private static int pickSciFi = 0;
    private static int pickMystery = 0;
    private static int pickThriller = 0;
    private static int numGames1 = 0;
    private static int numGames2 = 0;
    private static int numGames3 = 0;
    private static int numGames4 = 0;
    private static int numgames5 = 0;


    public static int getPickAction() {
        return pickAction;
    }

    public static int getPickAdventure() {
        return pickAdventure;
    }

    public static int getPickComedy() {
        return pickComedy;
    }

    public static int getPickCrime() {
        return pickCrime;
    }
    public static int getPickFamily() {
        return pickFamily;
    }

    public static int getPickFantasy() {
        return pickFantasy;
    }

    public static int getPickMystery() {
        return pickMystery;
    }

    public static int getPickSciFi() {
        return pickSciFi;
    }

    public static int getPickThriller() {
        return pickThriller;
    }

    public static void setPickAction(int pickAction) {
        trackChoices.pickAction = pickAction;
    }

    public static void setPickAdventure(int pickAdventure) {
        trackChoices.pickAdventure = pickAdventure;
    }

    public static void setPickComedy(int pickComedy) {
        trackChoices.pickComedy = pickComedy;
    }

    public static void setPickCrime(int pickCrime) {
        trackChoices.pickCrime = pickCrime;
    }

    public static void setPickFamily(int pickFamily) {
        trackChoices.pickFamily = pickFamily;
    }

    public static void setPickFantasy(int pickFantasy) {
        trackChoices.pickFantasy = pickFantasy;
    }

    public static void setPickMystery(int pickMystery) {
        trackChoices.pickMystery = pickMystery;
    }

    public static void setPickSciFi(int pickSciFi) {
        trackChoices.pickSciFi = pickSciFi;
    }

    public static void setPickThriller(int pickThriller) {
        trackChoices.pickThriller = pickThriller;
    }

    public static int getNumGames1() {
        return numGames1;
    }

    public static int getNumGames2() {
        return numGames2;
    }

    public static int getNumGames3() {
        return numGames3;
    }

    public static int getNumGames4() {
        return numGames4;
    }

    public static int getNumgames5() {
        return numgames5;
    }


    public static void setNumGames1(int actGames) {
        trackChoices.numGames1 = actGames;
    }

    public static void setNumGames2(int advGames) {
        trackChoices.numGames2 = advGames;
    }

    public static void setNumGames3(int comGames) {
        trackChoices.numGames3 = comGames;
    }

    public static void setNumGames4(int criGames) {
        trackChoices.numGames4 = criGames;
    }

    public static void setNumgames5(int famGames) {
        trackChoices.numgames5 = famGames;
    }


}
