package BusinessDelegatePattern.server;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by JMSService");
    }
}
