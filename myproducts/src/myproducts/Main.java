package myproducts;

public class Main {

	public static void main(String[] args) {
		Bread bread = new Bread("Barna keny�r", 220, 21, 10000);
		Product product = new Product("Hangsz�r�", 50000, 20);
		
		System.out.println(bread);
		System.out.println(product);
		Product product2 = new Bread("Kov�szos keny�r", 500, 27, 0.64);
		System.out.println(product2);
		
		Bread bread2 = new Bread("kifli", 300, 12, 0.1);
		
		System.out.println(Bread.firstIsMoreExpensive(bread2, (Bread)product2));
		System.out.println((Product)bread2);
	}

}
