package patterns.structural.criteria;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.criteria.filter.AndCriteria;
import patterns.structural.criteria.filter.Criteria;
import patterns.structural.criteria.filter.CriteriaFemale;
import patterns.structural.criteria.filter.CriteriaMale;
import patterns.structural.criteria.filter.CriteriaSingle;
import patterns.structural.criteria.filter.OrCriteria;

public class CriteriaDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("Jone", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bob", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();

		Criteria singleMale = new AndCriteria(male, single);
		Criteria singleOrFemale = new OrCriteria(female, single);

		System.out.println("Males: ");
		for (Person person : male.meetCriteria(persons)) {
			System.out.println(person);
		}

		System.out.println("Females: ");
		for (Person person : female.meetCriteria(persons)) {
			System.out.println(person);
		}

		System.out.println("Single: ");
		for (Person person : single.meetCriteria(persons)) {
			System.out.println(person);
		}

		System.out.println("Single or Females: ");
		for (Person person : singleOrFemale.meetCriteria(persons)) {
			System.out.println(person);
		}

		System.out.println("Single Males: ");
		for (Person person : singleMale.meetCriteria(persons)) {
			System.out.println(person);
		}

	}
}
