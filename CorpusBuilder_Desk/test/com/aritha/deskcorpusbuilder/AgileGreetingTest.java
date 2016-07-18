package com.aritha.deskcorpusbuilder;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgileGreetingTest {

	@Test
	public void should_set_greeting_message_while_constructing() {
		String expectedMessage = "Hello Agile World2!";
		
		AgileGreeting agileGreeting = new AgileGreeting(expectedMessage);
		
		String actualMessage = agileGreeting.getMessage();
		assertSame("The message should read as Hello Agile World2!", 
				expectedMessage, actualMessage);
	}
}
