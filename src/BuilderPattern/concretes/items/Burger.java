package BuilderPattern.concretes.items;

import BuilderPattern.concretes.packactions.Wrapper;
import BuilderPattern.interfaces.Item;
import BuilderPattern.interfaces.Packing;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
