package StrategyPatternV2;

import StrategyPatternV2.algorithms.OperationAdd;
import StrategyPatternV2.algorithms.OperationMultiply;
import StrategyPatternV2.algorithms.OperationSubstract;
import StrategyPatternV2.contexts.Context;

/**
 * Created by khanhtc on 4/18/17.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}
