package CommandPattern.stock;

import CommandPattern.command.Order;

/**
 * Created by khanhtc on 4/23/17.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
