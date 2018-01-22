package NullObjectPattern;

import NullObjectPattern.models.AbstractCustomer;

public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("khanhtc");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("khanh");

        System.out.println("Customers: ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
