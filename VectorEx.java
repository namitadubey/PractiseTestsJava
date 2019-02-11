import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("One");
		v.addElement("Two");
		v.addElement("Three");
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println();
	}
}
