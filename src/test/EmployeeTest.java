package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test/appcontext-setter-injection.xml");
		
		Employee employee=context.getBean("empId" , Employee.class);
		Employee employee1=context.getBean("emp2Id" , Employee.class);
		
		System.out.println(employee);
		System.out.println(employee1);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
