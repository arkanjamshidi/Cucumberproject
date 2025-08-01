Feature: Login

Scenario Outline: Login with valid information
  Given User navigates to the page
  When User clicks on Login
  And User enters valid email address "<username>"
  And User enters valid password "<password>"
  And User clicks the login button
  Then User should successfully login

Examples:
  | username                  | password |
  | ammar.jamshidi1@gmail.com | 12345    |
  | ammar.jamshidi2@gmail.com | 12345    |
  | ammar.jamshidi8@gmail.com | 12345    |
