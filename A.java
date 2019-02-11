//Example of static nested class, and call static and non static method.
public class A {

	class B {

	}

	static class C {

	}
}

class D {
	//static class
	A.C c = new A.C();
	//non staic class
	A a = new A();
	A.B b = a.new B();
}
