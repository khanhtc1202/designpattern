package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("khanhtc", "CEO", 30000);

        Employee headSale = new Employee("bachnx", "Head Sale", 20000);

        Employee headMarketing = new Employee("tungdv", "Head Marketing", 20000);

        Employee cleck1 = new Employee("Laura", "Maketing", 10000);
        Employee cleck2 = new Employee("Bob", "Maketing", 10000);

        Employee sale1 = new Employee("Richard", "Sale", 10000);
        Employee sale2 = new Employee("Rob", "Sale", 10000);

        CEO.add(headSale);
        CEO.add(headMarketing);

        headMarketing.add(cleck1);
        headMarketing.add(cleck2);

        headSale.add(sale1);
        headSale.add(sale2);

        System.out.println(CEO);

        for (Employee headEmployee: CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee: headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
