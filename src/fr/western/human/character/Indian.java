package fr.western.human.character;

import fr.western.human.Human;

public class Indian extends Human {

    private int feathersNumber;
    private String totem;

    //CONSTRUCTORS
    public Indian(String name) {
        super(name, "Root juice");
        setTotem("Coyote");
        setFeathersNumber(0);
    }

    public Indian(String name, String favoriteDrink) {
        super(name, favoriteDrink);
        setTotem("Coyote");
        setFeathersNumber(0);
    }

    public Indian(String name, String favoriteDrink, int feathersNumber) {
        super(name, favoriteDrink);
        setFeathersNumber(feathersNumber);
        setTotem("Coyote");
    }

    public Indian(String name, String favoriteDrink, int feathersNumber, String totem) {
        super(name, favoriteDrink);
        setFeathersNumber(feathersNumber);
        setTotem(totem);
    }


    // GETTERS AND SETTERS
    public int getFeathersNumber() {
        return this.feathersNumber;
    }

    public void setFeathersNumber(int feathersNumber) {
        this.feathersNumber = feathersNumber;
    }

    public String getTotem() {
        return this.totem;
    }

    public void setTotem(String totem) {
        this.totem = totem;
    }

    // METHODS

    public String scalp(PaleFace paleface){
        this.feathersNumber += 1;
        System.out.println(paleface.scalped());
        return this.talk("Give me your crane, you damn human, Ugh !");
    }

    @Override
    public String introduce(){
        return this.talk("Hi i'm " + this.getName() + " and my favorite drink is " + this.getFavoriteDrink().toLowerCase() +". UGH !") ;
    }

    @Override
    public String drink() {
        return this.talk("Sah ! A great glass of " + this.getFavoriteDrink().toLowerCase() + " UGH !");
    }
}
