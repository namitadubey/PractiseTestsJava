public class ClosureEx {
	public static void main(String[] args) {
		int a = 20;

		//explains scoping of a which is used in lambda,
		doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i+a);
			}
		});

		doProcess(10, i-> System.out.println(i+a));

	}

	private static void doProcess(int i , Process p){
		//execution of lambda is done here, and it is taking local variable
		p.process(i);
	}
}

interface Process{
	void process(int i);
}
