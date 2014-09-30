MUnit Test Case(s) Documentation 
---------------------------------

A. MUnit test case file name       : src/test/munit/munit-test-contactUpdates-config.xml
   Testing against Mule-flow file  : src/main/app/contactUpdates-config.xml
   Flow name to be invoked & tested: requestCreateContactFlow

	
	1. Test Case #1: Perform test for a negative scenario using HTTP GET
		- Name: Testing HTTP GET against the API call
		- Description: Perform the negative test against the API using valid id with HTTP Method GET   
          	  The SFDC message processor is mocked-up in order to handle the request and return the valid payload.

	2. Test Case #2: Positive Test using a valid payload (employee-Id: 999) and with HTTP POST call
		- Name: Testing HTTP POST against the API call
		- Description: Perform the test against valid employee-id which ad payload   
          	  The SFDC message processor is mocked-up in order to handle the request and return the valid payload.

          	  
          	  *** The End ***
          	  
