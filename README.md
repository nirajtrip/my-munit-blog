my-sample-project-munit-blog
============================

Mule MUnit Blog - Sample Project


Here is a list of the main XML files you'll find in this application:

* [property-config.xml](#propertyconfig)
* [contactUpdated-config.xml](#contactUpdated-config)


## property-config.xml<a name="propertyconfig"/>
Configuration for Connectors and properties files.


## contactUpdated-config.xml<a name="contactUpdated-config"/>

requestCreateContactFlow
Creates Contact in the Salesforce system using synchronous request/response.


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


## Related URLs:

## MUnit 
   https://github.com/mulesoft/munit
## MUnit Maven Plugin
   https://github.com/mulesoft/maven-mule-plugin
## Salesforce Connector   
  https://github.com/mulesoft/salesforce-connector


