import java.util.Calendar;

public class Vehicule {

	protected String model;
	protected int buyingYear;
	protected float buyingPrice;
	protected String immatriculationNumber;
	protected char drivingLesson;
	
	public Vehicule(String model, int buyingYear, float buyingPrice, String immatriculationNumber, char drivingLesson) {
		super();
		this.model = model;
		this.buyingYear = buyingYear;
		this.buyingPrice = buyingPrice;
		this.immatriculationNumber = immatriculationNumber;
		this.drivingLesson =drivingLesson;
		
	}

	public void displayVehicule() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Vehicule [model = " + model + ", buyingYear = " + buyingYear +  ", buyingPrice = " + buyingPrice + ", immatriculationNumber = " + immatriculationNumber + ", drivingLesson = " + drivingLesson;
	}
	
	public int age() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return currentYear - buyingYear;
	}
	
	public int countLocation() {
		if (age() <= 1) {
			return (int) buyingPrice/200;
		} else {
			return (int) buyingPrice/250;
		}
	}

}
