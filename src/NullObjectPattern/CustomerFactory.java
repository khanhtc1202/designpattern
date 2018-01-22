package NullObjectPattern;

import NullObjectPattern.models.AbstractCustomer;
import NullObjectPattern.models.NullCustomer;
import NullObjectPattern.models.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"khanhtc", "tran", "khanh"};

    public static AbstractCustomer getCustomer(String name) {
        for (String _name: names) {
            if (_name.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
