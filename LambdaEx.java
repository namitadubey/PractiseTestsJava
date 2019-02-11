public class LambdaEx {
	public static void main(String[] args) {
		int w = 10;

		Drawable d2 = () -> {
			System.out.println("Drawing" +w);
		};

	}
}

interface Drawable {
	public void draw();
}
