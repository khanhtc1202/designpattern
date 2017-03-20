package IntroToDP.concretes;

import IntroToDP.interfaces.QuackBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak...");
    }
}
