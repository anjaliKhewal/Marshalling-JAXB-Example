package com.xmltojava.demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.javatoxml.demo.Answer;
import com.javatoxml.demo.Question;

public class XmlToObject {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		File file = new File("D:\\iLearn\\Marshalling\\question.xml");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		Question ques = (Question) jaxbUnmarshaller.unmarshal(file);
		
		System.out.println(ques);
		System.out.println(ques.getId());
		System.out.println(ques.getQuestionName());
		
		List<Answer> list = ques.getAnswers();
		
		for(Answer a:list){
			System.out.println(a);
			
		}
	}

}
