Feature: Fizz Buzz Game
  So that plays can be validated
  As a Fizz Buzz umpire
  I want to enter a play and see the correct answer

  Scenario: Get answers based on played numbers
    Given I am officiating a FizzBuzz game
    When the number 1 is played
    Then I should be told the correct answer is "1"
