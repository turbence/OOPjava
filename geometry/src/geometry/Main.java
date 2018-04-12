package geometry;

public class Main {

	public static void main(String[] args) {
		Barrel barrel = new Barrel(10,10);
		System.out.println("barrel: " + barrel);
		System.out.println(barrel.getVolume());
		
		Cuboid cuboid = new Cuboid(10,10,10);
		System.out.println("cuboid" + cuboid);
		System.out.println(cuboid.getVolume());
		
		System.out.println("The barrel is bigger: " + barrel.isBigger(cuboid));
	}

}
