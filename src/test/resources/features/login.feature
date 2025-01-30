Feature: Login SwagLabs App

  Scenario: Login successfully with valid credentials
    When "User" types username "standard_user" and password "secret_sauce" on SwagLabs app
    Then should see the welcome message "PRODUCTS"

  Scenario Outline: Login failed with incorrect credentials
    When "User" types username "<user>" and password "<password>" on SwagLabs app
    Then should see the error message "Username and password do not match any user in this service."
    Examples:
      | user           | password      |
      | standard_user1 | secret_sauce  |
      | standard_user  | secret_sauce2 |

  Scenario Outline: Login failed with empty fields
    When "User" types username "<user>" and password "<password>" on SwagLabs app
    Then should see the error message "<message>"
    Examples:
      | user          | password     | message              |
      |               | secret_sauce | Username is required |
      | standard_user |              | Password is required |