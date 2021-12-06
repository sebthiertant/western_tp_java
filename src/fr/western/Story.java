package fr.western;

import fr.western.human.Human;
import fr.western.human.character.*;

public class Story {
    public static void main(String[] args) {

        // 1.2
        Cowboy lukyLuke = new Cowboy("Luky Luke", "Beer", "Fastest shooter in the world" );
        Lady marianne = new Lady("Marianne");
        Brigand dalton = new Brigand("Joe Dalton", "Pepsi");
        Bartender boris = new Bartender("Boris", "At word's end");
        Cowboy leon = new Sherif("Leon");
        Rotten dumb = new Rotten("Dumb");
        RottenLady calamityJane = new RottenLady("Calamity Jane");
        Indian charles = new Indian("Charles");

        System.out.println(dumb.introduce());
        System.out.println(dumb.kidnap(marianne));
        System.out.println(boris.introduce());
        System.out.println(boris.serveFavoriteDrink(lukyLuke));
        System.out.println(lukyLuke.introduce());
        System.out.println(marianne.introduce());
        System.out.println(marianne.drink());
        System.out.println(leon.introduce());
        System.out.println(dalton.introduce());
        System.out.println(dalton.kidnap(marianne));
        System.out.println(lukyLuke.shoot(dalton));
        System.out.println(dalton.getCatch(lukyLuke));
        System.out.println(lukyLuke.freeLady(marianne));
        System.out.println(marianne.thankFull(lukyLuke));

        System.out.println(calamityJane.introduce());
        System.out.println(charles.scalp(marianne));

    }
}
