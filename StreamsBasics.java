import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsBasics {

	//Streams : A sequence of elements
	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Tauseef"),
			new Person("Sandhya"),
			new Person("Swati"),
			new Person("Sachin"));

		list
			.stream()
			.filter(p->p.getName().startsWith("S"))
			.forEach(System.out::println);

		list
			.stream()
			.filter(p->p.getName().startsWith("T"))
			.collect(Collectors.toList());

		Optional<Person> first = list
			.stream()
			.filter(p->p.getName().startsWith("T"))
			.findFirst();
	}
}
