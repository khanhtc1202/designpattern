package PrototypePattern.model;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("In Rectangle draw() method!");
    }
}
