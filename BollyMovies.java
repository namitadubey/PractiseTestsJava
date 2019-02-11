//Comparator Example
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BollyMovies implements Comparable<BollyMovies> {
	private double rating;
	private String name;
	private int year;

	//Used to sort movies by year
	public int compareTo(BollyMovies m){
		return this.year - m.year;
	}
	//Constructor
	public BollyMovies(double r, String n, int y) {
		this.rating=r;
		this.name=n;
		this.year=y;
	}

	//getter method for accessing private data
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
}

class NameCompare implements Comparator<BollyMovies> {
	public int compare(BollyMovies B1, BollyMovies B2){
		return B1.getName().compareTo(B2.getName());
	}
}

class RatingCompare implements Comparator<BollyMovies> {
	public int compare(BollyMovies B1, BollyMovies B2) {
		if(B1.getRating() < B2.getRating()) return -1;
		if(B1.getRating() > B2.getRating()) return  1;
		else return 0;
	}
}

class DriverMainBolly {
	public static void main(String[] args) {
		ArrayList<BollyMovies> list = new ArrayList<>();
		list.add(new BollyMovies(2.5, "Don", 2010));
		list.add(new BollyMovies(1.2, "Krishh", 2014));
		list.add(new BollyMovies(1.1, "Dhamal", 1994));
		list.add(new BollyMovies(1.2, "Kick", 1990));

		//Sort by Movie year using comparable
		Collections.sort(list);

		System.out.println("Sort by year");
		for (BollyMovies movie : list) {
			System.out.println(movie.getName()+" "
				+movie.getRating()+" "+movie.getYear());
		}

		//Sort by Movie Name
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		System.out.println("Sort by Name");
		for (BollyMovies movie : list) {
			System.out.println(movie.getName()+" "
				+movie.getRating()+" "+movie.getYear());
		}

		//Sort by movie rating
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		System.out.println("Sort by Rating");
		for (BollyMovies movie : list) {
			System.out.println(movie.getName()+" "
				+movie.getRating()+" "+movie.getYear());
		}
	}
}
