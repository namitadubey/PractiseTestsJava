import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HashSetEx {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(49);
		l.add(50);

		System.out.println(l);

		/*Predicate<Integer> p = x -> x<20;
		l.removeIf(p);

		System.out.println(l);
		//-------------------------

		UnaryOperator<Integer> u = x -> x/4;
		l.replaceAll(u);
		System.out.println(l);
		//-------------------------

		// By for each loop
		String arr[] = {"1", "2", "3"};
		for (String i : arr) {
			System.out.println(i);
		}*/

		//By iterator
	/*	Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/

	/*	//By ListIterator Interface
		ListIterator<Integer> iterator1 = l.listIterator(l.size()); //reverse direction
		while (iterator1.hasPrevious()) {
			Integer s = iterator1.previous();
			System.out.println(s);
		}*/

		//By foreachRemaning Method
/*		Iterator itr = l.iterator();
		Consumer<Integer> c = new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println(integer * 2);
			}
		};
		itr.forEachRemaining(c);
		System.out.println(l);*/

		try {
			//Serialization
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(l);
			fos.close();
			oos.close();

			//De
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList newList = (ArrayList) ois.readObject();
			fis.close();
			ois.close();
			System.out.println(l);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
