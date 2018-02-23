package AbstractFactoryPattern.models;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill drew shape with red color");
    }
}
