package CommandPattern;

import CommandPattern.broker.Broker;
import CommandPattern.stock.BuyStock;
import CommandPattern.stock.SellStock;
import CommandPattern.stock.Stock;

/**
 * Created by khanhtc on 4/23/17.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
