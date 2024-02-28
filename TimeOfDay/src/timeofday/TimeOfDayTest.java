package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay(10, 30);
		assertEquals(10,myTime.getHours());
		assertEquals(30,myTime.getMinutes());
				
	}

}
