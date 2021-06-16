# XEBuisness
Selenium Documentation References:-

1) https://www.selenium.dev/documentation/en/



# Test Automation Project

•	Acceptance test for http://www.xe.com/currencyconverter/
•	The Acceptance criteria is to test multiple conversion rates
•	The test  iterate over 2 sets of sample data.
•	Example iteration : 
o	The test should input from Euro to INR.
o	Verify the result on the proceeding page.
* For UI testing,  Selenium with BDD Framework is used
* Desktop chrome for UI testing
* Extent Report for reporting can be added



## Table of Contents

1. Development requirements
2. Configuring test project
3. Creating tests
4. Creating Logging Handler
5. Running tests 
6. Project structure

## 1. Development requirements

**Required:** Chrome browser, Chrome Driver(91.0.4472.19), Java Development Kit 15 (JDK11) and maven (3.6.3) should be present on environment in order to develop and/or run the tests.

## 2. Configuring test project

Run this command to ensure the code has no errors:

```
$ mvn clean install
```

## 3. Creating tests

The test cases are written in gherkin language in feature file present under src\test\java\org\expleo\XE\Features. The implementation of feature file is written in java located at   src\test\java\Oog\expleo\XE\stepDefinations.

## 4. Running tests

$ mvn clean install 
 

## 5. Project structure
src/main/java/org/expleo/XE -: contains four packages.
 
 BaseResources -: contain a java class named Base.java which is a Base class and  data.properties file
 CommonClasses -: contains an Abstract java class named AbstractComponent.
 MainPage -: contains two java classes MainPage and MainPanelNavigation whch are PageObjects(
 Tools -: contains four java classes.Alerts and Chart classes ( PageComponent code for Alerts and chart will be added) Third is Convertor class which Page Component class for Convertor component and Fourth class is Navigate(PageObject(Navigation class for Tools PageComponent class.))
 
 src/test/java/org/expleo/XE -: contains two packages.
    
    Features -: Contains a feature file Conversion.feature which contains the scenario for conversion of feature.
    TestRunner -: Contains the TestRunner java class.
    
 src/test/java/Oog/expleo/XE-: contains one package
     
     Step Defination -: Contains StepDefination class containing code for Conversion feature file.




