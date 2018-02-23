package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.models.Color;
import AbstractFactoryPattern.models.Green;
import AbstractFactoryPattern.models.Red;
import AbstractFactoryPattern.models.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
