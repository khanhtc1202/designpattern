package BridgePattern.shape;

import BridgePattern.colorful.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawApi;

    protected Shape(DrawAPI drawAPI) {
        this.drawApi = drawAPI;
    }

    public abstract void draw();
}
