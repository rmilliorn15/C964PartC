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
}
