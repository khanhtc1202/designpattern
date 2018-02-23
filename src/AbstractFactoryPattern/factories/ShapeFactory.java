package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.models.Circle;
import AbstractFactoryPattern.models.Color;
import AbstractFactoryPattern.models.Rectangle;
import AbstractFactoryPattern.models.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null) {
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
