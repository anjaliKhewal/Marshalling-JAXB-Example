package com.javatoxml.demo;

public class Answer {
	
	private int id;
	
	private String postedBy;
	
	private String answerName;

	public Answer(int id, String postedBy, String answerName) {
		super();
		this.id = id;
		this.postedBy = postedBy;
		this.answerName = answerName;
	}

	public Answer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", postedBy=" + postedBy + ", answerName="
				+ answerName + "]";
	}
	
	
}
