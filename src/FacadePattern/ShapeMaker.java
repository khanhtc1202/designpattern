package FacadePattern;

import FacadePattern.shapes.Circle;
import FacadePattern.shapes.Rectangle;
import FacadePattern.shapes.Shape;
import FacadePattern.shapes.Square;

/**
 * Created by khanhtc on 4/26/17.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
