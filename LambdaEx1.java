public class LambdaEx1 {
	public static void main(String[] args) {

		Calculate c = (x, y) -> (x+y);
		c.add(2,4);
		System.out.println(c.add(2,4));

	}
}
interface Calculate {
	public int add(int x , int y);
	}
