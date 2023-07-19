package org.depencecy.com;

import org.depencecy.com.cars.Corolla;
import org.depencecy.com.cars.Swift;
import org.depencecy.com.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		Car swift = new Swift();
		Car corolla = new Corolla();

		System.out.println(swift.specs());
		System.out.println(corolla.specs());
		
		//Car mycar=new Swift();
		//System.out.println(mycar.specs());

		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mycar=context.getBean(Car.class);
		mycar.specs();
		context.close();
	}
}
