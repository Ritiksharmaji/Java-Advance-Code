package com.spring.test;

import com.spring.HelloSpring;
import org.springframework.context.*;

public class Test {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new 
		ClasspathXmlApplicationContext("applicationContext.xml");
		HelloSpring bean = (HelloSpring)context.getBean("helloBean");
		System.out.println(bean.sayHello());
		}

}
