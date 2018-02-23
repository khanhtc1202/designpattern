package AbstractFactoryPattern;

import AbstractFactoryPattern.factories.ColorFactory;
import AbstractFactoryPattern.factories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if(factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
