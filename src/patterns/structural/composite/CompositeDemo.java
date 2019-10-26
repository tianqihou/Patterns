package patterns.structural.composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Employee CEO = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robot", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing",
				20000);
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		Employee sale1 = new Employee("Richard", "Sales", 10000);
		Employee sale2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headMarketing);
		CEO.add(headSales);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		headSales.add(sale1);
		headSales.add(sale2);

		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
