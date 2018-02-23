package AbstractFactoryPattern;

import AbstractFactoryPattern.models.Color;
import AbstractFactoryPattern.models.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
