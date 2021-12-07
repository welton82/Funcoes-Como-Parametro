package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Application {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Computer", 1750.65));
		list.add(new Product("Tv", 2450.65));
		list.add(new Product("Tablet", 900.00));
		list.add(new Product("Iphone", 4500.0));

		list.forEach(System.out::println);

		ProductService service = new ProductService();
		Double d = service.filteredSum(list, p -> p.getName().toLowerCase().charAt(0) == 't');
		Double dd = service.filteredSum(list, p -> p.getPrice() < 2000.0);
		 System.out.println("Value: " + String.format("%.2f", d));
		 System.out.println("Value dd: " + String.format("%.2f", dd));
	
	}

}
