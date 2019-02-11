import java.util.function.Consumer;

public class ConsumerIntLambdaEx {
	public static void main(String[] args) {
		Consumer c = x -> System.out.println(x);
		c.accept(4);
	}
}
