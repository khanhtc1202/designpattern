package ProxyPattern.ProxyClasses;

import ProxyPattern.OriginalClasses.*;
/**
 * Created by khanhtc on 1/31/17.
 */
public class Proxy extends Subject{

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now!");

        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
