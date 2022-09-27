package model;

public class filterCsv {
    private static boolean action;
    private static boolean adventure;
    private static boolean comedy;
    private static boolean crime;
    private static boolean family;
    private static boolean fantasy;
    private static boolean mystery;
    private static boolean sciFi;
    private static boolean thriller;


    public static void setAction(boolean choice){
        action = choice;
    }

    public static boolean isAction(){
        return action;
    }


    public static void setAdventure(boolean choice){
        adventure = choice;
    }

    public static boolean isAdventure(){
        return adventure;

    }

    public static void setComedy(boolean choice){
        comedy = choice;
    }

    public static boolean isComedy() {
        return comedy;
    }

    public static void setCrime(boolean choice){
        crime = choice;
    }

    public static boolean isCrime() {
        return crime;
    }

    public static void setFamily(boolean choice){
        family = choice;
    }

    public static boolean isFamily() {
        return family;
    }

    public static void setFantasy(boolean choice){
        fantasy = choice;
    }

    public static boolean isFantasy() {
        return fantasy;
    }

    public static void setMystery(boolean choice){
        mystery = choice;
    }

    public static boolean isMystery() {
        return mystery;
    }

    public static void setSciFi(boolean choice){
        sciFi = choice;
    }

    public static boolean isSciFi() {
        return sciFi;
    }

    public static void setThriller(boolean choice){
        thriller = choice;
    }

    public static boolean isThriller() {
        return thriller;
    }
}
