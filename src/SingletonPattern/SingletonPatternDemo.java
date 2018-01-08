package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
