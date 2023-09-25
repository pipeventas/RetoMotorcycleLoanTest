Feature: Apply for a motorcycle loan

  As a Bancolombia user
  I want to apply for a motorcycle loan
  To finance the purchase of a new motorcycle.

  Scenario: Applying for a motorcycle loan with valid value
    Given that the actor is on Bancolombia's homepage
    When the actor requests a motorcycle loan with a value of $100,000
    Then the actor should see a success message

  Scenario: Request motorcycle loan with various values (Use Limit Values Criteria)
    Given that the actor is on Bancolombia's homepage
    When the actor requests a motorcycle loan with the following values:
      | Value       |
      | $20,000,000 |
      | $15,000,000 |
      | $-300.000   |


  Scenario: Applying for a motorcycle loan with valid values and terms
    Given that the actor is on Bancolombia's homepage
    When the actor requests a motorcycle loan with a value of $ 19,350,355 and a term of 48 months
    Then the actor should see a success message with the following information:
      |    Information     |  Value     |
      |---                 |---         |
      |Loan Value          |$ 19,350,355|
      |Loan term           |48 months   |
      |Monthly installment |$776,553.39 |

  Scenario: Applying for a motorcycle loan with invalid values and terms
    Given that the actor is on Bancolombia's homepage
    When the actor requests a motorcycle loan with a value of $ 19,350,355 and a term of 0 months
    Then the actor should see an error message with the following information:
      | Information   | Value                       |
      | Error message | The term cannot be 0 months |

  Scenario: Requesting a motorcycle loan with a value entered with non-numeric characters
    Given that the actor is on Bancolombia's homepage
    When the actor requests a motorcycle loan with a value of $ 19,350,355 and a term of 12 months
    Then the actor should see an error message with the following information:
      | Information   | Value                              |
      | Error Message | The value entered must be a number |