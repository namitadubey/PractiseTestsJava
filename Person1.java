import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person1 {

	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public int getAge() {
		return age;
	}

	private String lasName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1(String firstName, String lasName, int age) {
		this.firstName = firstName;
		this.lasName = lasName;
		this.age = age;
	}

	@Override
	public String toString() {return String.format("", firstName, lasName, age);}
}

class LambdaClass{
	public static void main(String[] args) {
		LambdaClass lambdaClass = new LambdaClass();

		List<Person1> personList = Arrays.asList(new Person1("Namita", "Dubey", 35),
			  								                     new Person1("Test", "User", 45),
																		         new Person1("Test1", "User1", 44));

			//Print all elements in list
		for(Person1 person : personList) {
			System.out.println(person.toString());
		}

		lambdaClass.printConditionally(personList, p-> true);

		//Print all elements starting from s
		for (Person1 person : personList) {
			if (person.getFirstName().startsWith("T")) {
				System.out.println(person.toString());
			}
		}

		//sort list by lastname
		Collections.sort(personList, new Comparator<Person1>() {
			@Override
			public int compare(Person1 o1, Person1 o2) {
				return o1.getLasName().compareTo(o2.getLasName());
			}
		});

		Collections.sort(personList, (o1,o2) -> o1.getLasName().compareTo(o2.getLasName()));

		System.out.println("List after sorting" + personList);
	}

	public  void printConditionally(List<Person1> list, Condition c) {
		System.out.println("print on condition");
		for (Person1 p : list) {
			if (c.test(p)) {
				System.out.println(p.toString());
			}
		}
	}
}

interface Condition {
	boolean test(Person1 p);
}


