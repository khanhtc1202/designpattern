package DecoratorPattern.test;

import DecoratorPattern.concrete.BlueShapeDecorator;
import DecoratorPattern.concrete.Circle;
import DecoratorPattern.concrete.Rectangle;
import DecoratorPattern.concrete.RedBorderDecorator;
import DecoratorPattern.interfaces.Shape;


/**
 * Created by khanhtc on 4/17/17.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedBorderDecorator(new Circle());
        Shape redRectangle = new RedBorderDecorator(new Rectangle());
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape mixCircle = new RedBorderDecorator(blueCircle);

        System.out.println("\nCircle with normal border :");
        circle.draw();
        System.out.println("\nCircle with red border :");
        redCircle.draw();
        System.out.println("\nRectangle with red border :");
        redRectangle.draw();
        System.out.println("\nCircle with blue area :");
        blueCircle.draw();
        System.out.println("\nMix circle :");
        mixCircle.draw();
    }
}
