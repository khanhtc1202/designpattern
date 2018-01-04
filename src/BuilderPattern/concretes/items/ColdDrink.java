package BuilderPattern.concretes.items;

import BuilderPattern.concretes.packactions.Bottle;
import BuilderPattern.interfaces.Item;
import BuilderPattern.interfaces.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
