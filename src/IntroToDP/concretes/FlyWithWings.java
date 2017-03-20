package IntroToDP.concretes;

import IntroToDP.interfaces.FlyBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly by my wings!");
    }
}
