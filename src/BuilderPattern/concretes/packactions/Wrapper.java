package BuilderPattern.concretes.packactions;

import BuilderPattern.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapped";
    }
}
