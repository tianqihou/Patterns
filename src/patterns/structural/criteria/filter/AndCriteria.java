package patterns.structural.criteria.filter;

import java.util.List;

import patterns.structural.criteria.Person;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
	}

}
