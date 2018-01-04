package BuilderPattern.concretes.items;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 12.1f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
