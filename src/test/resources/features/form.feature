Feature: Filling the form in Product Registration

  Background:
    Given user should navigate to the bugaboo link
    When user selects the dropdown button
    And user select Product Registration option
    And click Next button

  @TS04
  Scenario Outline: Filling the First Name input box

    And filling the "<Serial Number>"
    And filling "<Purchase Date>"
    And choose "<Purchase Location>"
    And writing "<Description>"
    And filling first name"<First Name>"
    And filling last name"<Last Name>"
    And filling email"<Email>"
    And verify verify email"<Verify Email>"
    And filling phone "<Phone>"
    And filling street first address "<Street Address 1>"
    And filling street second address "<Street Address 2>"
    And filling city "<City>"
    And filling country "<Country>"
    Then verify user should see "Thank you for contacting us about your product. You will receive a confirmation in your email. We will process your request as soon as possible."


    #Valid inputs
    Examples:
      | Serial Number | Purchase Date | Purchase Location | Description          | First Name | Last Name | Email             | Verify Email      | Phone    | Street Address 1 | Street Address 2 | City   | Country  |
      | 12345         | Sep 5, 2023   | online            | buying stroller      | Magbule    | Bamja     | magbule@gmail.com | magbule@gmail.com | 34456765 | Rruga Tirana     | Rruga Prishtina  | Tirana | Albania  |
      | 12346         | Sep 6, 2023   | shop              | buying baby stroller | Mery       | Smith     | mery@gmail.com    | mery@gmail.com    | 90155512 | Road             | Road2            | Sofia  | Bulgaria |

@TS05
    Scenario Outline: filling the form with invalid serial number

    And filling the invalid serial "<Invalid Serial Number>"
    And filling "<Purchase Date>"
    And choose "<Purchase Location>"
    And writing "<Description>"
    And filling first name"<First Name>"
    And filling last name"<Last Name>"
    And filling email"<Email>"
    And verify verify email"<Verify Email>"
    And filling phone "<Phone>"
    And filling street first address "<Street Address 1>"
    And filling street second address "<Street Address 2>"
    And filling city "<City>"
    And filling country "<Country>"
    And click Next button
    Then verify user see "No product found with this serial number. Please check your input and try again."

    Examples:

#invalid serial number
      | Serial Number | Purchase Date | Purchase Location | Description     | First Name | Last Name | Email             | Verify Email      | Phone    | Street Address 1 | Street Address 2 | City   | Country |
      | #$%ghjh       | Sep 5, 2023   | online            | buying stroller | Magbule    | Bamja     | magbule@gmail.com | magbule@gmail.com | 34456765 | Rruga Tirana     | Rruga Prishtina  | Tirana | Albania |