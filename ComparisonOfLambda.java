public class ComparisonOfLambda {
	public static void main(String[] args) {
		ComparisonOfLambda comparisonOfLambda = new ComparisonOfLambda();

		comparisonOfLambda.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this);
			}

			@Override
			public String toString(){
				return "Anaonymous class";
			}
		});


	}

	private void doProcess(int i , Process p){
		//execution of lambda is done here, and it is taking local variable
		p.process(i);
	}
}

