package BusinessDelegatePattern.server;

public class BusinessDelegate {
    private BusinessLookup lookupService = new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(this.serviceType);
        businessService.doProcessing();
    }
}
