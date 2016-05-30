
public class HeavyTruck extends Vehicule{

	private int stockVolume;
	
	public int getStockVolume() {
		return stockVolume;
	}

	public void setStockVolume(int stockVolume) {
		this.stockVolume = stockVolume;
	}

	public HeavyTruck(String model, int buyingYear, float buyingPrice, String immatriculationNumber,
			char drivingLesson, int stockVolume) {
		super(model, buyingYear, buyingPrice, immatriculationNumber, drivingLesson);
		this.stockVolume = stockVolume;
	}
	
	public boolean canConveyVolume(int volume) {
		if (stockVolume >= volume) {
			return true;
		} else {
			return false;
		}
	}
	
	public void displayHeavyTruck() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", HeavyTruck [stockVolume = " + stockVolume + "]";
	}
	
}
