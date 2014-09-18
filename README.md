my-sample-project-munit-test
============================

Mule MUnit Blog - Sample Project


Here is a list of the main XML files you'll find in this application:

* [property-config.xml](#propertyconfigxml)
* [my-sample-project-munit-test.xml](#my-sample-project-munit-test)
* [errorHandling.xml](#errorhandlingxml)


## property-config.xml<a name="propertyconfigxml"/>
Configuration for Connectors and properties files.


## my-sample-project-munit-test.xml<a name="my-sample-project-munit-test"/>
There are two flows present in the file:

RequestInventoryFlow
Retrieves a inventory details for items in a synchronous request/response.

UpdateInventoryFlow
Send an update to the inventory service via a PUT method in an asynchronous manner. 

## errorHandling.xml<a name="errorhandlingxml"/>
Contains a [Catch Exception Strategy](http://www.mulesoft.org/documentation/display/current/Catch+Exception+Strategy) that is only Logging the exception thrown (If so). As you imagine, this is the right place to handle how your integration will react depending on the different exceptions.


## Compiling

Build & Compile:
```console
$mvn clean compile package
```


Testing
----------------------    

To run the tests, use:

To Run the Test (MUnit and JUnit):
```console
$mvn test
```


### MUnit Test Case Summary

* [MUnit-test-readMe.txt](src/test/resources/MUnit-test-readMe.txt)
