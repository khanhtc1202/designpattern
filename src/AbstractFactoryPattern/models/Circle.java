package AbstractFactoryPattern.models;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle!");
    }
}
