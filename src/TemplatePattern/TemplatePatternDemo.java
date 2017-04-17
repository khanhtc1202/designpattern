package TemplatePattern;

import TemplatePattern.abstracts.Game;
import TemplatePattern.concretes.Cricket;
import TemplatePattern.concretes.Football;

/**
 * Created by khanhtc on 4/18/17.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
