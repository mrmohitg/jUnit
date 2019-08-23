package learning.spring.eventHandling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
		
		applicationContext.registerShutdownHook();
		
		Shape myAdvCircle = (Shape) applicationContext.getBean("advanceCircle20");
		myAdvCircle.draw();
		
		System.out.println(applicationContext.getMessage("greeting", null, "Default Greeting", null));;
	}
}
 