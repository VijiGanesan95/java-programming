package com.springframework.springsample;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
    public static void main(String[] args) {
		/*
		 * Resource rs = new ClassPathResource("ApplicationContext.xml"); BeanFactory
		 * bean = new XmlBeanFactory(rs);
		 */
       ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		  Employee e = context.getBean("emp",Employee.class);
		  System.out.println(e.toString());
		  
		  CustomerService cServ = context.getBean("cust",CustomerService.class);
		  System.out.println(cServ.toString()); CustomerService cServBeforeAdvice =
		  context.getBean("custProxy",CustomerService.class);
		  System.out.println("*******************"); cServBeforeAdvice.printName();
		  System.out.println("*******************"); cServBeforeAdvice.printUrl(); try
		  { cServBeforeAdvice.printThrowException(); }catch(Exception ex) {
		  
		  }
		 
       
    }
}
