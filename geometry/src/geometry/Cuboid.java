package geometry;

public class Cuboid extends Prism {
	
	private double aSide;
	private double bSide;
	
	public Cuboid(int height, double aSide, double bSide) {
		super(height);
		this.aSide = aSide;
		this.bSide = bSide;
	}
	
	@Override
	public double getBaseArea() {
		return aSide * bSide;
	}
	
	@Override
	public String toString() {
		return "Cuboid, a side:" + aSide + ", b side: " + bSide;
	}
	
}
