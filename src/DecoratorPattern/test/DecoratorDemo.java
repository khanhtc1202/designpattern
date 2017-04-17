package DecoratorPattern.test;

import DecoratorPattern.concrete.BlueShapeDecorator;
import DecoratorPattern.concrete.Circle;
import DecoratorPattern.concrete.Rectangle;
import DecoratorPattern.concrete.RedShapeDecorator;
import DecoratorPattern.interfaces.Shape;


/**
 * Created by khanhtc on 4/17/17.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
//        Shape circle = new Circle();
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape mixCircle = new RedShapeDecorator(blueCircle);

//        System.out.println("Circle with normal border!!!");
//        circle.draw();
//        System.out.println("Circle with red border!!!");
//        redCircle.draw();
//        System.out.println("Rectangle with red border!!!");
//        redRectangle.draw();
//        System.out.println("Circle with blue area!!!");
//        blueCircle.draw();
        mixCircle.draw();
    }
}
