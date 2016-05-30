
public class Coach extends HeavyTruck{

	private int passengerSize;
	
	public int getPassengerSize() {
		return passengerSize;
	}

	public void setPassengerSize(int passengerSize) {
		this.passengerSize = passengerSize;
	}
	
	public Coach(String model, int buyingYear, float buyingPrice, String immatriculationNumber, char drivingLesson,
			int stockVolume, int passengerSize) {
		super(model, buyingYear, buyingPrice, immatriculationNumber, drivingLesson, stockVolume);
		this.setPassengerSize(passengerSize);
	}
	
	public void displayCoach() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Coach [passengerSize = " + passengerSize + "]";
	}
	
	public boolean canConveyPassenger(int nbPassengers, float averageVolume) {
		if (passengerSize >= nbPassengers && getStockVolume() >= averageVolume*nbPassengers) {
			return true;
		} else {
			return false;
		}
	}
}
