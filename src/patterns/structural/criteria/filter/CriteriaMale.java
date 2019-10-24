package patterns.structural.criteria.filter;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.criteria.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if ("MALE".equalsIgnoreCase(person.getGender())) {
				malePersons.add(person);
			}
		}

		return malePersons;
	}

}
