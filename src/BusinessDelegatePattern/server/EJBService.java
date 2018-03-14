package BusinessDelegatePattern.server;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by EJBService");
    }
}
