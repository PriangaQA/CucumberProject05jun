Feature: This feature will allow you do to all the calculator operations using parameters

  Scenario Outline: To add two numbers and validate the results are coming fine
    Given I have two numbers <num1> and <num2>
    When I add those two numbers
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    7 |    6 |     13 |
      |    8 |    8 |     15 |
      |   15 |   12 |     27 |

  Scenario: This feature will allow you to validate the addition of multiple numbers
    Given i have below numbers
      | 10 |
      | 12 |
      |  3 |
      |  4 |
      | 10 |
      | 20 |
      |  1 |
    When i add those numbers
    Then i should get the sum as 60

  Scenario: To calculate the total bill amount
    Given i want to buy the below items
      | Coffee | 20 |
      | Burger | 50 |
    When I purchase them
    Then i should get the bill amount as 70

  Scenario: To calculate the total bill amount using given quantity
    Given i want to buy the below items
      | Coffee       | 2 | 20 |
      | Burger       | 2 | 60 |
      | Garlic Bread | 1 | 15 |
    When I purchase them
    Then i should get the bill amount as 175
