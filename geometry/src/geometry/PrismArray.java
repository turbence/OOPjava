package geometry;

public class PrismArray {
	private PrismArray(int size) {
		prismArray = new Prism[size];
	}
	
	public void setElement(int index, Prism prism) {
		prismArray[index] = prism;
	}
	
	public int getSize() {
		return prismArray.length;
	}
	
	public Prism getElement(int index) {
		return prismArray[index];
	}
	
	public int getNotNull() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				count++;
			}
		}
	}
	
	public double getAverageVolume() {
		double average = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				average += prism.getVolume()
			}	
		}
		average = average / getNotNull();
		return average;
	}
	
	public int getBarrelCount() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism instaceof Barrel) {
				count++;
			}
		}
		return count;
	}
	
}
