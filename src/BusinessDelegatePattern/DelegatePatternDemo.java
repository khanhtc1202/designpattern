package BusinessDelegatePattern;

import BusinessDelegatePattern.client.Client;
import BusinessDelegatePattern.server.BusinessDelegate;

public class DelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
