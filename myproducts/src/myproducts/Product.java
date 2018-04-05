package myproducts;

public class Product {
	private String name;
	private int price;
	private int tax;
	
	public Product(String name, int price, int tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	public int getPriceWithTax() {
		return (Integer) price * (1 + tax/100);
	}
	
	@Override
	public String toString() {
		return name + ", " + getPriceWithTax() + "ft";
	}
	
	public void raisePrice(int percentage) {
		price = price * (percentage / 100);
	}
	
	public int compareProducts(Product other) {
		if(getPriceWithTax() > other.getPriceWithTax()) {
			return 1;
		}
		if (getPriceWithTax() < other.getPriceWithTax()) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
