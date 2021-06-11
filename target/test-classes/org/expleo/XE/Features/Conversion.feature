Feature: Acceptance criteria to test multiple conversion rates
Background:
Given user opens the Web Browser
When user navigates to the url
Then The page loads and the main logo is shown on the page

Scenario Outline: Convert the value from one currency to another
Given The covert option is selected by the user
When User enter the Amount "<Amount>"
And  User select currency From DropDownList<From>
And  User select currency To DropDownList<To>
And  User click on the convert button
Then Currency conversion result is displayed
Examples:
|Amount|
|1000|
|2000|
#|3000|
#|4050|
#|5|

