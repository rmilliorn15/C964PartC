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

    /**
     * Setter for action choice made by user.
     * @param choice
     */
    public static void setAction(boolean choice){
        action = choice;
    }

    /**
     * Getter for Action choice.
     * @return
     */
    public static boolean isAction(){
        return action;
    }

    /**
     * setter for adventure choice
     * @param choice
     */
    public static void setAdventure(boolean choice){
        adventure = choice;
    }

    /**
     * getter for adventure choice
     * @return
     */
    public static boolean isAdventure(){
        return adventure;
    }

    /**
     * setter for comedy choice
     * @param choice
     */
    public static void setComedy(boolean choice){
        comedy = choice;
    }

    /**
     * getter for comedy choice
     * @return
     */
    public static boolean isComedy() {
        return comedy;
    }

    /**
     * setter for crime choice
     * @param choice
     */
    public static void setCrime(boolean choice){
        crime = choice;
    }

    /**
     * getter for crime choice.
     * @return
     */
    public static boolean isCrime() {
        return crime;
    }

    /**
     * Setter for family choice
     * @param choice
     */
    public static void setFamily(boolean choice){

        family = choice;
    }

    /**
     * getter for family choice
     * @return
     */
    public static boolean isFamily() {
        return family;
    }

    /**
     * setter for fantasy choice
     * @param choice
     */
    public static void setFantasy(boolean choice){
        fantasy = choice;
    }

    /**
     * getter for fantasy choice
     * @return
     */
    public static boolean isFantasy() {
        return fantasy;
    }

    /**
     * Setter for mystery choice
     * @param choice
     */
    public static void setMystery(boolean choice){
        mystery = choice;
    }

    /**
     * getter for mystery choice
     * @return
     */
    public static boolean isMystery() {
        return mystery;
    }

    /**
     * setter for scifi choice
     * @param choice
     */
    public static void setSciFi(boolean choice){
        sciFi = choice;
    }

    /**
     * gettet for scifi choice
     * @return
     */
    public static boolean isSciFi() {
        return sciFi;
    }

    /**
     * setter for thriller choice
     * @param choice
     */
    public static void setThriller(boolean choice){
        thriller = choice;
    }

    /**
     * getter for thriller choice.
     * @return
     */
    public static boolean isThriller() {
        return thriller;
    }
}
