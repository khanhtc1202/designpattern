package BuilderPattern.concretes.packactions;

import BuilderPattern.interfaces.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottled";
    }
}
