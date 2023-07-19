 package org.depencecy.com.cars;

import org.depencecy.com.interfaces.Car;
import org.springframework.stereotype.Component;

@Component
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
