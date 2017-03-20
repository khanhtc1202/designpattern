package IntroToDP.concretes;

import IntroToDP.interfaces.FlyBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
