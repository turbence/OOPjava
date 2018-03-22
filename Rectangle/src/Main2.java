import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args)
	{
		Rectangle[] rectangles = new Rectangle[10];
		Random rnd = new Random();
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(rnd.nextInt(9)+2, rnd.nextInt(9)+2);
			
		}
		
		
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		
		Rectangle minRectangle = rectangles[0];
		for (int i = 1; i < rectangles.length; i++) {
			if (minRectangle.isBigger(rectangles[i])) {
				minRectangle = rectangles[i];
			}
		}
		
		System.out.println("Legkisebb területû téglalap: " + minRectangle);
		
		Scanner scanner = new Scanner(System.in);
		Rectangle userRectangle;
		System.out.println("Téglalap a oldala");
		int aSide = scanner.nextInt();
		System.out.println("Téglalap b oldala");
		int bSide = scanner.nextInt();
		userRectangle = new Rectangle(aSide, bSide);
		System.out.println(userRectangle);
		
		int count = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (userRectangle.isBigger(rectangles[i])) {
				count++;
			}
		}
		System.out.println(count + " db kisebb téglalap van");
		
		
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].equals(userRectangle)) {
				System.out.println(i);
				break;
			}
			else if (i == rectangles.length) {
				System.out.println("Nincs ilyen");
			}
		}
	}
}
