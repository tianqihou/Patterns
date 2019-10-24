package patterns.structural.criteria.filter;

import java.util.List;

import patterns.structural.criteria.Person;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstPersons = criteria.meetCriteria(persons);
		List<Person> otherPersons = otherCriteria.meetCriteria(persons);
		for (Person person : otherPersons) {
			if (!firstPersons.contains(person)) {
				firstPersons.add(person);
			}
		}
		return firstPersons;
	}

}
