
public class Truck extends HeavyTruck{

	public Truck(String model, int buyingYear, float buyingPrice, String immatriculationNumber, char drivingLesson,
			int stockVolume) {
		super(model, buyingYear, buyingPrice, immatriculationNumber, drivingLesson, stockVolume);
	}

	public void displayCoach() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
