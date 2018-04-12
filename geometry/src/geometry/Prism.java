package geometry;

public abstract class Prism {
	
	private int height;
	
	public Prism(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public abstract double getBaseArea();
	
	public double getVolume() {
		return height * getBaseArea();
	}
	
	public boolean isBigger(Prism prism) {
		return getVolume() > prism.getVolume();
	}
	
	
}
