package StrategyPattern.models;

import StrategyPattern.interfaces.FlyBehavior;
import StrategyPattern.interfaces.QuackBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior (FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior (QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void display() {
        System.out.println("I'm a duck!!!");
    }

    public void performFlyBehavior() {
        this.flyBehavior.fly();
    }

    public void performQuackBehavior() {
        this.quackBehavior.quack();
    }
}
