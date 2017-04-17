package StrategyPattern;

import StrategyPattern.concretes.FlyWithWings;
import StrategyPattern.models.MallardDuck;
import StrategyPattern.models.PlasticDuck;

/**
 * Created by khanhtc on 2/7/17.
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        PlasticDuck plasticDuck = new PlasticDuck();

        mallardDuck.display();
        mallardDuck.performFlyBehavior();
        mallardDuck.performQuackBehavior();

        plasticDuck.display();
        plasticDuck.performFlyBehavior();
        plasticDuck.performQuackBehavior();
        plasticDuck.setFlyBehavior(new FlyWithWings());
        plasticDuck.performFlyBehavior();
    }
}
