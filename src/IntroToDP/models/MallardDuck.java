package IntroToDP.models;

import IntroToDP.concretes.FlyWithWings;
import IntroToDP.concretes.Quack;
import IntroToDP.models.Duck;

/**
 * Created by khanhtc on 2/7/17.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck!");
    }
}
