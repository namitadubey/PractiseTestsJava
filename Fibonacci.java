public class Fibonacci {

	public static void main (String[] args) {
		//Display fibonacci using for loop
		int n =50;
		int t1=0;
		int t2=1;
		System.out.println("First" +n+ "terms");

		for(int i=0; i<n; i++) {
			System.out.print(t1 + "-");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}
