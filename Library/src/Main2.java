import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookStyle[] booksWithStyle = new BookStyle[scanner.nextInt()];
		scanner.close();
		booksWithStyle[0] = new BookStyle("Stargate", "thor", 1996, 42, "Scifi");
		for (int i = 1; i < booksWithStyle.length; i++) {
			booksWithStyle[i] = new BookStyle("Trónok harca" + i, "George" + i + "Martin", 2000+i, i*1000, "fantasy" + new Random().nextInt(3));
		}
		
		double count = 0;
		if (booksWithStyle.length > 0) {
			count = 1;
		}
		boolean newStyle = true;
		for (int i = 0; i < booksWithStyle.length; i++) {
			for (int j = 0; j < i; j++) {
				if (booksWithStyle[i].getStyle().equalsIgnoreCase(booksWithStyle[j].getStyle())) {
					newStyle = false;
					break;
				}
			}
			if (newStyle) {
				count++;
			}
		}
		for (BookStyle bookStyle : booksWithStyle) {
			if (bookStyle.getStyle().equalsIgnoreCase("scifi")) {
				System.out.println(bookStyle);
			}
		}
		
		double avgPrice = 0;
		for (BookStyle bookStyle : booksWithStyle) {
			if (bookStyle.getStyle().equalsIgnoreCase("scifi")) {
				count++;
				avgPrice = bookStyle.getPrice();
			}
		}
		
		
	}

}
