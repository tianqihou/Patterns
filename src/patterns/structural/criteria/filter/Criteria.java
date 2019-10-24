package patterns.structural.criteria.filter;

import java.util.List;

import patterns.structural.criteria.Person;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
