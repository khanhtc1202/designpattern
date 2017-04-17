package DecoratorPattern.concrete;

import DecoratorPattern.interfaces.Shape;
import DecoratorPattern.interfaces.ShapeDecorator;

/**
 * Created by khanhtc on 4/17/17.
 */
public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setBlueArea(decoratorShape);
    }

    private void setBlueArea(Shape decoratorShape) {
        System.out.println("Shape with Blue area!!!");
    }
}
