package lab9.streamAPI.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id= " + id + ", name= " +
	name + ", price= " + price + "]";
	}
	
}

public class StreamProductDemo {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(101, "Keyboard", 1800));
		productList.add(new Product(102, "Mouse", 1050));
		productList.add(new Product(103, "HardDrive", 11000));
		productList.add(new Product(104, "Ram", 6400));
		productList.add(new Product(105, "camera", 1500));
		
		for (Product product : productList) {
			if (product.price < 5000) {
				System.out.println(product);
			}
		}
		System.out.println();
		
		Stream<Product> product = productList.stream();
		product.forEach(p -> System.out.println(p));
		System.out.println();
		
		List<String> filteredProductName = 
				productList.stream()
				.filter(p -> p.price < 5000)
				.map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(filteredProductName);
		System.out.println();
		
		List<Product> filteredProductList = 
				productList.stream()
				.filter((p) -> p.price < 5000)
				.map(p -> p)
				.collect(Collectors.toList());
		System.out.println(filteredProductList);
		System.out.println();
		
		productList.stream().filter(p -> p.price < 5000)
		.forEach(p -> System.out.println(p));
		System.out.println();
		
		productList.stream().filter(p -> p.price < 10000)
		.forEach(p -> System.out.println(p.name));
	}

}
