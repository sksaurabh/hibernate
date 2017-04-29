package com.om.hello.test;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.om.hello.bean.PersonBean;

public class Tester {

	public static void main(String[] args) {

		String springFile = "D:\\jspiders\\btr_05012015\\spring_helloworld\\src\\beans.xml";

		File file = new File(springFile);

		FileSystemResource resource = new FileSystemResource(file);

		BeanFactory factory = new XmlBeanFactory(resource);

		System.out.println(factory);

		PersonBean personBean = (PersonBean) factory.getBean("sachin");

		System.out.println(personBean.toString());

	}

}
