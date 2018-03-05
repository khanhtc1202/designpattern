package BridgePattern.shape;

import BridgePattern.colorful.DrawAPI;

public class Circle extends Shape {
    private int radius, x, y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
