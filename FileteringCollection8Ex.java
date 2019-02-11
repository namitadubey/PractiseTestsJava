import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileteringCollection8Ex {
	public static void main(String[] args) {
		List<Product1> product1List = new ArrayList<>();
		product1List.add(new Product1(1, "Apple", 25000f));
		product1List.add(new Product1(2, "Dell", 35000f));
		product1List.add(new Product1(3, "lenovo", 40000f));
		List<Float> productPriceList2 = product1List
			.stream()
			.filter(p ->p.price > 30000)//filtering data
			.map(p -> p.price) //fetching price
			.collect(Collectors.toList()); //Collecting as list
		System.out.println(productPriceList2);

		float totalPrice2 = product1List.stream()
			.map(product->product.price)
			.reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
		System.out.println(totalPrice2);
	}
}

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
