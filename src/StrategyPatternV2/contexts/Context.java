package StrategyPatternV2.contexts;

import StrategyPatternV2.interfaces.Strategy;

/**
 * Created by khanhtc on 4/18/17.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
