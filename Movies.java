//Comparable example
import java.util.ArrayList;
import java.util.Collections;

public class Movies implements Comparable<Movies> {
	private double rating;
	private String name;
	private int year;

	//Used to sort movies by year
	public int compareTo(Movies m){
		return this.year - m.year;
	}
	//Constructor
	public Movies(double r, String n, int y) {
		this.rating=r;
		this.name=n;
		this.year=y;
	}

	//getter method for accessing private data
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
}

class DriverMain {
	public static void main(String[] args) {
		ArrayList<Movies> list = new ArrayList<>();
		list.add(new Movies(2.5, "Don", 2010));
		list.add(new Movies(1.2, "Krishh", 2014));
		list.add(new Movies(1.1, "Dhamal", 1994));
		list.add(new Movies(1.2, "Kick", 1990));

		Collections.sort(list);

		for (Movies movie : list) {
			System.out.println(movie.getName()+" "
			+movie.getRating()+" "+movie.getYear());
		}
	}
}
