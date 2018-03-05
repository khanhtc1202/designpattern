package BridgePattern;

import BridgePattern.colorful.GreenCircle;
import BridgePattern.colorful.RedCircle;
import BridgePattern.shape.Circle;
import BridgePattern.shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 100, 100);
        Shape greenCircle = new Circle(new GreenCircle(), 10, 100, 100);

        redCircle.draw();
        greenCircle.draw();
    }
}
