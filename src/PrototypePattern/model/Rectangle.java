package PrototypePattern.model;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("In Rectangle draw() method!");
    }
}
