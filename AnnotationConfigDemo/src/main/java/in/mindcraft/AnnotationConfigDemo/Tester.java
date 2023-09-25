package in.mindcraft.AnnotationConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mindcraft.AnnotationConfigDemo.MobilePhone;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		MobilePhone m1=(MobilePhone)context.getBean("mobilePhone"); //name of class in small letters
		m1.show();
		MobilePhone m2=(MobilePhone)context.getBean("mobilePhone"); //name of class in small letters
		m2.show();

	}

}
