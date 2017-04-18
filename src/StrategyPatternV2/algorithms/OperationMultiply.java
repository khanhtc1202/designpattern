package StrategyPatternV2.algorithms;

import StrategyPatternV2.interfaces.Strategy;

/**
 * Created by khanhtc on 4/18/17.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
