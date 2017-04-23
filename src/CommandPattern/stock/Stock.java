package CommandPattern.stock;

/**
 * Created by khanhtc on 4/23/17.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy () {
        System.out.println("Stock [ Name: "+name+", Quantity: "+quantity+" ] bought");
    }

    public void sell () {
        System.out.println("Stock [ Name: "+name+", Quantity: "+quantity+" ] sold");
    }
}
