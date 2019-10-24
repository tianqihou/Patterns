package patterns.structural.criteria.filter;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.criteria.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if ("single".equalsIgnoreCase(person.getMaritalStatus())) {
				singlePersons.add(person);
			}
		}

		return singlePersons;
	}

}
