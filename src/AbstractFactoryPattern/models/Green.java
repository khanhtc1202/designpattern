package AbstractFactoryPattern.models;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill drew shape with green color");
    }
}
