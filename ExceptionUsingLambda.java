import java.util.function.BiConsumer;

public class ExceptionUsingLambda {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int key = 2;

		// put try catch where u r sending the behaviour
		//process(numbers, key, (n1,n2)-> System.out.println(n1/n2));

		//for readability, externalize lambda try catch and use it.
		process(numbers, key, wrapper((n1, n2)->System.out.println(n1/n2)));

	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int n : numbers) {
			System.out.println("from process");
			biConsumer.accept(n, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> biConsumer) {
		return (k,v)-> {
			System.out.println("from wrapper");
			try {
				biConsumer.accept(k, v);
			} catch (ArithmeticException e) {
				e.getMessage();
			}};
	}
}
