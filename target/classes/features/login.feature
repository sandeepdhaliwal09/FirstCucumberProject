Feature: Free CRM Login Feature



#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "Sandeepdhaliwal09@gmail.com" and "Salenium01"
#Then user clicks on login button
#Then user is on home page






Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser
Examples:

     | username                    | password  |
     | Sandeepdhaliwal09@gmail.com | Salenium01|
     | rabia                       | Hello0    |
