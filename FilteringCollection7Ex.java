import java.util.ArrayList;
import java.util.List;

public class FilteringCollection7Ex {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		//Adding products
		productList.add(new Product(1, "Apple", 25000f));
		productList.add(new Product(2, "Dell", 35000f));
		productList.add(new Product(3, "lenovo", 40000f));

		List<Float> productPriceList = new ArrayList<Float>();
		for (Product product : productList) {
			//Filtering data of list
				if(product.price<30000){
	          productPriceList.add(product.price); //adding price to productList
			}
		}
		System.out.println(productPriceList);
	}
}

class Product{
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
