Feature: Filling the form in Product Registration

  @TS04
  Scenario Outline: Filling the First Name input box
    Given user should navigate to the bugaboo link
    When user selects the dropdown button
    And user select Product Registration option
    And click Next button
    And filling the "<Serial Number>"
    And filling "<Purchase Date>"
    And choose "<Purchase Location>"
    And writing "<Description>"
    And filling "<First Name>"
    And filling "<Last Name>"
    And filling "<Email>"
    And verify "<Verify Email>"
    And filling "<Phone>"
    And filling "<Street Address 1>"
    And filling "<Street Address 2>"
    And filling "<City>"
    And filling "<Country>"
    Then verify user should see "Thank you for contacting us about your product. You will receive a confirmation in your email. We will process your request as soon as possible."


    #Valid inputs
Examples:
  | Serial Number | Purchase Date | Purchase Location | Description     | First Name | Last Name | Email             | Verify Email      | Phone        | Street Address 1 | Street Address 2 | City   | Country |
  | 12345         | Sep 5, 2023   | online            | buying stroller | Magbule    | Bamja     | magbule@gmail.com | magbule@gmail.com | +35534456765 | Rruga Tirana     | Rruga Prishtina  | Tirana |Albania  |




