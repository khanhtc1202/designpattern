package StrategyPattern.concretes;

import StrategyPattern.interfaces.QuackBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
