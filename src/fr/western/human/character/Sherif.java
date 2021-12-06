package fr.western.human.character;


public class Sherif extends Cowboy implements PaleFace {
    private int arrestedBrigand;

    // CONSTRUCTOR
    public Sherif(String name) {
        super("Sherif " + name);
    }

// ACTIONS
    public String introduce() {
        return this.talk("I'm the sherif " + this.getName() + " and I have arrested " + this.arrestedBrigand + " brigand(s). ");
    }

    public String lookingForBrigand(Brigand brigand){
        return this.talk("Oy Oy dear people ! " + brigand.getWantedReward() + "$ to anyone who capture " + brigand.getName() + ".");
    }

    public String arrestBrigand(Outlaw outlaw){
        this.arrestedBrigand += 1;
        return this.talk("From the name of the low, I arrested you " + outlaw.getName() + " !");
    }

    public String scalped(){
        return this.talk("No, my head !!");
    }
}
