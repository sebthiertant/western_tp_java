package fr.western.human.character;

public class Rotten extends Sherif implements Outlaw, PaleFace{

    private float wantedReward;
    private int capturedLadiesCount;
    private boolean isInJail;


    // CONSTRUCTOR
    public Rotten(String name) {
        super(name);
    }


    // GETTERS SETTERS
    public void setWantedReward(float wantedReward) {
        this.wantedReward = wantedReward;
    }

    public float getWantedReward(){
        return this.wantedReward;
    }

    public int getCapturedLadiesCount() {
        return this.capturedLadiesCount;
    }

    public void setCapturedLadiesCount(int capturedLadiesCount) {
        this.capturedLadiesCount = capturedLadiesCount;
    }

    public boolean isInJail() {
        return this.isInJail;
    }

    public void setIsInJail(boolean inJail) {
        this.isInJail = inJail;
    }


    // METHODS
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
