package com.ponylucifel.spring.cucumberdemo.integration.steps;

import static org.testng.Assert.assertEquals;

import com.ponylucifel.spring.cucumberdemo.integration.CucumberIntegrationDemo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDemoSteps extends CucumberIntegrationDemo {

	private String response;
	@When("^I make a GET request to hello$")
	public void i_make_a_GET_request_to_hello() throws Throwable {
		String url = getUrl("/rest/demo/hello");
	     response = rest.getForObject(url, String.class);
	}

	@Then("^A response returned should be Hello, world$")
	public void a_response_returned_should_be_Hello_world() throws Throwable {
	    assertEquals("Hello, world", response);
	}
	
	@When("^I make a GET request with \"([^\"]*)\"$")
	public void i_make_a_GET_request_with(String someWord) throws Throwable {
	    String url = getUrl("/rest/demo/" + someWord);
	    response = rest.getForObject(url, String.class);
	}
	
	@Then("^A response returned should be \"([^\"]*)\"$")
	public void a_response_returned_should_be(String expectedWord) throws Throwable {
	    assertEquals(expectedWord, response);
	}
}
