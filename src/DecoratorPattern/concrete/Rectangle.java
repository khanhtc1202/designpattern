package DecoratorPattern.concrete;

import DecoratorPattern.interfaces.Shape;

/**
 * Created by khanhtc on 4/17/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle!!!");
    }
}
