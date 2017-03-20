package IntroToDP.models;

import IntroToDP.concretes.FlyNoWay;
import IntroToDP.concretes.MuteQuack;
import IntroToDP.models.Duck;

/**
 * Created by khanhtc on 2/7/17.
 */
public class PlasticDuck extends Duck {
    public PlasticDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a plastic duck!");
    }
}
