
public class Main {

	public static void main(String[] args) {
		Rectangle firstRectangle = new Rectangle(86, 42);
		Rectangle secondRectangle = new Rectangle(17);
		Rectangle thirdRectangle = firstRectangle;
		
		System.out.println("1. "+firstRectangle);
		System.out.println("2. "+secondRectangle);
		System.out.println("3. "+thirdRectangle);
		System.out.println();
		firstRectangle.setBoth(56, 60);
		System.out.println("1. "+firstRectangle);
		System.out.println("2. "+secondRectangle);
		System.out.println("3. "+thirdRectangle);
		
		firstRectangle.setBoth(5, 10);
		secondRectangle.setBoth(5, 10);
		if (firstRectangle.equals(secondRectangle)) {
			System.out.println("Egyezik a kettõ");
		}
		else {
			System.out.println("Nem egyezik a kettõ");
		}
		if (firstRectangle.equals(thirdRectangle)) {
			System.out.println("Egyezik a kettõ");
		}
		else {
			System.out.println("Nem egyezik a kettõ");
		}
	}

}
