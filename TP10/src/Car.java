
public class Car extends Vehicule{

	private boolean carRadio;

	boolean getCarRadio() {
		return carRadio;
	}

	void CarRadio(boolean carRadio) {
		carRadio = true;
	}
	
	public void displayCar() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Car [carRadio = " + carRadio + "]";
	}
	
	public Car(String model, int buyingYear, float buyingPrice, String immatriculationNumber, char drivingLesson, boolean carRadio) {
		super(model, buyingYear, buyingPrice, immatriculationNumber, drivingLesson);
		this.carRadio = carRadio;
	}
	
	public boolean AddRadio() {
		if (carRadio != true) {
			carRadio = true;
		}
		return carRadio;
	}
	
	public boolean removeRadio() {
		if (carRadio == true) {
			carRadio = false;
		}
		return carRadio;
	}
}
