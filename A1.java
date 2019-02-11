public class A1 {
	private static String name = "test1";
	private static A1 a = new A1();

	static {
		name = "test2";
	}

	public A1(){
		name = "test3";
	}

	public static String print(){
		return a.name;
	};

	@Override
	public String toString() {
		return print();
	}
}
