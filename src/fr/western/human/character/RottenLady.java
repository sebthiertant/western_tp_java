package fr.western.human.character;

public class RottenLady extends Lady implements Outlaw, PaleFace{

    private boolean isCaptive;
    private String dressColor;
    private int capturedLadiesCount;
    private float wantedReward;
    private boolean isInJail;

    // CONSTRUCTORS
    public RottenLady(String name) {
        super(name);
    }

    public RottenLady(String name, String favoriteDrink) {
        super(name, favoriteDrink);
    }

    public RottenLady(String name, String favoriteDrink, String dressColor) {
        super(name, favoriteDrink, dressColor);
    }

    // GETTERS AND SETTERS
    public boolean isCaptive() {
        return isCaptive;
    }

    public void setCaptive(boolean captive) {
        isCaptive = captive;
    }

    @Override
    public String getDressColor() {
        return dressColor;
    }

    public int getCapturedLadiesCount() {
        return capturedLadiesCount;
    }

    public void setCapturedLadiesCount(int capturedLadiesCount) {
        this.capturedLadiesCount = capturedLadiesCount;
    }

    public void setWantedReward(float wantedReward) {
        this.wantedReward = wantedReward;
    }

    public float getWantedReward(){
        return this.wantedReward;
    }

    public boolean isInJail() {
        return isInJail;
    }

    public void setIsInJail(boolean inJail) {
        isInJail = inJail;
    }

    //METHODS
    @Override
    public String kidnap(Lady lady){
        lady.setIsCaptured(true);
        this.capturedLadiesCount += 1;
        System.out.println(lady.yell());
        return this.talk("AHAH ! I catched you " + lady.getName() + " you're mine.");
    }

    @Override
    public String getCatch(Cowboy cowboy){
        setIsInJail(true);
        return this.talk("Damn you " + cowboy.getName());
    }

    public String scalped(){
        return this.talk("No, my head !!");
    }
}
