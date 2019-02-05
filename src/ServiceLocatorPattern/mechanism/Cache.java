package ServiceLocatorPattern.mechanism;

import ServiceLocatorPattern.services.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean existed = false;

        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                existed = true;
            }
        }
        if (!existed) {
            services.add(newService);
        }
    }
}
