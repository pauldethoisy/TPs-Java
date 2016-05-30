import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

	@Test
	public void testAge() {
		Car car = new Car("Twingo", 2016, 10000, "1234 AZ 49", 'B', true);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		Assert.assertEquals(car.age(), currentYear - 2016);
	}

	@Test
	public void testAge2() {
		Car car = new Car("Twingo", 2016, 10000, "1234 AZ 49", 'B', true);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if (car.age() != currentYear - 2015) {
			fail("Age is wrong");
		}
	}
}
