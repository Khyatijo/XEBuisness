# XEBuisness
Selenium Documentation References:-

1) https://www.selenium.dev/documentation/en/



# Test Automation Project

•	Acceptance test for http://www.xe.com/currencyconverter/
•	The Acceptance criteria is to test multiple conversion rates
•	The test  iterate over 5 sets of sample data.
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
6. Extent Report
7. Project structure
8. Maven plugins
9. Gitlab CI

## 1. Development requirements

**Required:** Chrome browser, Chrome Driver(91.0.4472.19), Java Development Kit 15 (JDK11) and maven (3.6.3) should be present on environment in order to develop and/or run the tests.

## 2. Configuring test project

Run this command to ensure the code has no errors:

```
$ mvn clean install
```

## 3. Creating tests

The test cases are written in gherkin language in feature file present under src\test\java\org\expleo\XE\Features. The implementation of feature file is written in java located at   src\test\java\Oog\expleo\XE\stepDefinations.

## 3. Running tests

```
$ mvn clean install 
 

## 5. Project structure

  


