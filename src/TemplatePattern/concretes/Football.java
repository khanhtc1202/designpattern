package TemplatePattern.concretes;

import TemplatePattern.abstracts.Game;

/**
 * Created by khanhtc on 4/18/17.
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football game init!!!");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game start!!!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game end!!!");
    }
}
