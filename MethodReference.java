import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
	public static void main(String[] args) {

		MethodReference methodReference = new MethodReference();

		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				methodReference.print();
			}
		});
		thread.start();

   //If number of arg of lambda is equal to no of arg in method args in same seq then u can replace lambda seq with method reference
		Thread thread2 = new Thread(()-> methodReference.print());

		Thread thread1 = new Thread(methodReference::print);//method print should be static, if not static call through instance methodreference
*/
		List<Person> list = Arrays.asList(new Person("Tauseef"),
			new Person("Sandhya"),
			new Person("Swati"),
			new Person("Sachin"));

		//print(list, p->p.getName().startsWith("S"), p-> System.out.println(p));

		print(list, p->p.getName().startsWith("S"), System.out::println );

	}
/*
	public void print() {
		System.out.println("print");
	}*/

	public static void print(List<Person> list, Predicate<Person> p, Consumer<Person> c) {
		list.stream().filter(p).forEach(c);
	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			'}';
	}
}
