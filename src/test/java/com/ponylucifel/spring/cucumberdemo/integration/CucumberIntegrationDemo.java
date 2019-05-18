package com.ponylucifel.spring.cucumberdemo.integration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.ponylucifel.spring.cucumberdemo.CucumberDemoApplication;

@SpringBootTest(classes=CucumberDemoApplication.class)
@CucumberOptions(
		features= {"src/test/resources/features"}, 
		glue="com.ponylucifel.spring.cucumberdemo.integration.steps"
)
public class CucumberIntegrationDemo extends AbstractTestNGCucumberTests{
	
	protected static RestTemplate rest;
	
	@BeforeClass
	public void setup() {
		rest = new RestTemplate();
	}
	
	protected String getPort() {
		return "8080";
	}
	
	protected String getUrl(String path) {
		return "http://localhost:" + getPort() + path;
	}
}
