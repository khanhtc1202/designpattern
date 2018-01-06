package FilterPattern.interfaces;

import FilterPattern.models.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
