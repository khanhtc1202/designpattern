package FilterPattern;

import FilterPattern.concretes.*;
import FilterPattern.interfaces.Criteria;
import FilterPattern.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Rob", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bob", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("\nMale: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemale: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Male: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Female: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person: persons) {
            System.out.println("Person: [ " + person.getName() + " | " + person.getGender() + " | " + person.getMaritalStatus() + " ]");
        }
    }
}
