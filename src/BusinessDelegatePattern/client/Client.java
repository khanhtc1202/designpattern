package BusinessDelegatePattern.client;

import BusinessDelegatePattern.server.BusinessDelegate;

public class Client {
     BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        this.businessService.doTask();
    }
}
