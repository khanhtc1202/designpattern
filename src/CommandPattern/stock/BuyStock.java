package CommandPattern.stock;

import CommandPattern.command.Order;

/**
 * Created by khanhtc on 4/23/17.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
