
public class Number {
	 //Készítsen egy Szám osztályt a sajat.elso nevû csomagban, amelynek van egy osztályszintû
	 //konstans adattagja 0.001 értékkel egy tûrés tárolására. Legyen egy másik private adattagja egy valós szám tárolására.
	private static double delta = 0.001;
	
	 //Legyen konstruktora, amely a paraméterként kapott értékekkel inicializálja az adattagot.
	private double number;
	
	 //Legyen egy metódusa, amely igazat ad, ha a valós szám adattagnak a paraméterként kapottszámtól való eltérése a tûrésen belül van.
	
	public Number(double number) {
		this.number = number;
	}
	
	public boolean equals(Number number) {
		return Math.abs((this.number-number.number))<delta;
	}

	public static double getDelta() {
		return delta;
	}

	public static void setDelta(double delta) {
		Number.delta = delta;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	 //Legyen getter, setter metódusa a valós szám adattagra
	
	public String toString() {
		return Double.toString(number);
	}
}
