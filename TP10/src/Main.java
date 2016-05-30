
public class Main {

	public static void main(String [] args) {
		
		Car voiture1 = new Car("Twingo", 2016, 10000, "1234 AZ 49", 'B', true);
		
		System.out.println(voiture1);
		
		Truck camion1 = new Truck("J9", 2011, 20000, "987 BCD 75", 'B', 25);
		
		System.out.println(camion1);
		System.out.println(camion1.canConveyVolume(7));
		System.out.println(camion1.countLocation());
		
		Coach autocar1 = new Coach("FRI", 2005, 90000, "4567 WX 01", 'D', 3, 53);
		
		System.out.println(autocar1);
		System.out.println(autocar1.canConveyPassenger(40, 0.1F));
	}
}
