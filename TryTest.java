public class TryTest {

	public static void main(String[] args) {
		try {
			int i = 100 / 0;
			System.out.println("Integer i is " + i);
		} catch(ArithmeticException e){
			System.out.println(e);
		}
		}
}
