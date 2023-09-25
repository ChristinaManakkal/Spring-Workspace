package in.mindcraft.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		//Laptop l1=new Laptop(); //using spring i don't have to create obj using new spring will inject the obj

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Laptop l1=(Laptop)context.getBean("l1"); //Bean=object  //(Laptop)=typecast
		l1.show();
	}

}
