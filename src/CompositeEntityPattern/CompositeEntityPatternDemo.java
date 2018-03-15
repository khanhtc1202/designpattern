package CompositeEntityPattern;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();

        client.setData("Sample 1", "Data sample 1");
        client.printData();

        client.setData("Sample 2", "Data sample 2");
        client.printData();
    }
}
