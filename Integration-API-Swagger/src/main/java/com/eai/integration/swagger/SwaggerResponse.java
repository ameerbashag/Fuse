package com.eai.integration.swagger;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author AKSHAJ
 *
 */
@XmlRootElement(name="SwaggerResponse")
public class SwaggerResponse {
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
