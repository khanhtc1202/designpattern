package ProxyPattern.demo;

import ProxyPattern.ProxyClasses.Proxy;
/**
 * Created by khanhtc on 1/31/17.
 */
public class ProxyPatternEx {
    public static void main(String[] args) {
        System.out.println("Proxy pattern demo!");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
