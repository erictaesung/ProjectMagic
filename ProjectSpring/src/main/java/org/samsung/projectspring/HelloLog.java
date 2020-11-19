package org.samsung.projectspring;

import org.springframework.stereotype.Component;

@Component
public class HelloLog {

	public void printTime() {
		System.out.println(new java.util.Date());
	}
	
}


