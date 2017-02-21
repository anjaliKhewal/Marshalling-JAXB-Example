package com.javatoxml.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXml {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Answer ans1 = new Answer(101, "Spring Framework","Anjali");
		Answer ans2 = new Answer(102,"Web Service","Anjali");
		
		ArrayList<Answer> list = new ArrayList<Answer>();
		
		list.add(ans1);
		list.add(ans2);
		
		Question que = new Question(1,"What is java?", list);
		
		marshaller.marshal(que, new FileOutputStream("D:\\iLearn\\Marshalling\\question.xml"));
		
		System.out.println("written the xml file");
		
		
		
	}
}
