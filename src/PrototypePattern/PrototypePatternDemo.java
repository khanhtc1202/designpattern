package PrototypePattern;

import PrototypePattern.model.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Cloned shape type " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Cloned shape type " + clonedShape2.getType());
    }
}
