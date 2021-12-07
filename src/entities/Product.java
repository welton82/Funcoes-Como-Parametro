package entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("Name: ");
		s.append(name);
		s.append(" - Price R$: ");
		s.append(String.format("%.2f", price));

		return s.toString();
	}
}
