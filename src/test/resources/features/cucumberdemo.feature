Feature: This is a feature for Cucumber integration test demo

	Scenario: I run hello
		When I make a GET request to hello
		Then A response returned should be Hello, world
		
	Scenario: I make a GET request with some word and expect that back
		When I make a GET request with "TheWildBunch"
		Then A response returned should be "TheWildBunch"