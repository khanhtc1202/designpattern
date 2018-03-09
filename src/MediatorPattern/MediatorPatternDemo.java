package MediatorPattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");

        alice.sendMessage("Hello Bob");
        bob.sendMessage("Hi Alice");
    }
}
