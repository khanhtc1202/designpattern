package DecoratorPattern.concrete;

import DecoratorPattern.interfaces.Shape;
import DecoratorPattern.interfaces.ShapeDecorator;

/**
 * Created by khanhtc on 4/17/17.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border color: Red!!!");
    }
}
