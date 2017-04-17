package DecoratorPattern.interfaces;

import DecoratorPattern.interfaces.Shape;

/**
 * Created by khanhtc on 4/17/17.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
