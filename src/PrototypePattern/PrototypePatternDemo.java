package PrototypePattern;

import PrototypePattern.model.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape;

        clonedShape = ShapeCache.getShape("1");
        System.out.println("Cloned shape type " + clonedShape.getType());
        clonedShape.draw();

        clonedShape = ShapeCache.getShape("2");
        System.out.println("Cloned shape type " + clonedShape.getType());
        clonedShape.draw();
    }
}
