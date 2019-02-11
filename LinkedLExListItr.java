import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLExListItr {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addLast("Last");
		l.add("Two");
		l.addFirst("First");
		l.add("Three");
		System.out.println(l);

		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String) ltr.next();
			if(s.equals("Two")) {
				ltr.set("Gotcha");
			} else if(s.equals("Last")) {
				ltr.add("new One");
			} else  if(s.equals("First")) {
				ltr.remove();
			}
		}

		System.out.println(l);

	}
}
