package AbstractFactoryPattern;

import AbstractFactoryPattern.models.Color;
import AbstractFactoryPattern.models.Shape;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Color color1 = colorFactory.getColor("red");
        color1.fill();

    }
}
