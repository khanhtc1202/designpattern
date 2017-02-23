package ProxyPattern.OriginalClasses;

import ProxyPattern.OriginalClasses.Subject;
/**
 * Created by khanhtc on 1/31/17.
 */
public class ConcreteSubject extends Subject{

    @Override
    public void doSomeWork() {
        System.out.println("I'm in concrete subject class!");
    }
}
