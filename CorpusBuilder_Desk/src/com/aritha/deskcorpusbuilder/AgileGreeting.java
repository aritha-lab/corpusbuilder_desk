package com.aritha.deskcorpusbuilder;

public class AgileGreeting {
	private String message;
	
	public AgileGreeting(String greetingMessage) {
		message = greetingMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void greet() {
		System.out.println(message);
	}
}
