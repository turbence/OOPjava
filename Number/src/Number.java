
public class Number {
	 //K�sz�tsen egy Sz�m oszt�lyt a sajat.elso nev� csomagban, amelynek van egy oszt�lyszint�
	 //konstans adattagja 0.001 �rt�kkel egy t�r�s t�rol�s�ra. Legyen egy m�sik private adattagja egy val�s sz�m t�rol�s�ra.
	private static double delta = 0.001;
	
	 //Legyen konstruktora, amely a param�terk�nt kapott �rt�kekkel inicializ�lja az adattagot.
	private double number;
	
	 //Legyen egy met�dusa, amely igazat ad, ha a val�s sz�m adattagnak a param�terk�nt kapottsz�mt�l val� elt�r�se a t�r�sen bel�l van.
	
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
	
	 //Legyen getter, setter met�dusa a val�s sz�m adattagra
	
	public String toString() {
		return Double.toString(number);
	}
}
