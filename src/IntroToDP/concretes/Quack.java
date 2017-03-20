package IntroToDP.concretes;

import IntroToDP.interfaces.QuackBehavior;

/**
 * Created by khanhtc on 2/7/17.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack...");
    }
}
