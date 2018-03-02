package PrototypePattern.model;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("In Circle draw() method!");
    }
}
