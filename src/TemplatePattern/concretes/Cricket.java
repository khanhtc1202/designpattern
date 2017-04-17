package TemplatePattern.concretes;

import TemplatePattern.abstracts.Game;

/**
 * Created by khanhtc on 4/18/17.
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket game init!!!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game start!!!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game end!!!");
    }
}
