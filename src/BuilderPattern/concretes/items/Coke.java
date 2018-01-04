package BuilderPattern.concretes.items;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 10.1f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
