Feature: Navigation to the form page


  Background:
    Given user should navigate to the bugaboo link

  @TS01
  Scenario:Navigate to homepage
    Then user should confirm contact customer text is displayed

  @TS02
  Scenario: Selecting drop down button
    When user selects the dropdown button
    Then verify user see dropdownOptions

      | Delivery, Return or Refund |
      | Order or Payment Related   |
      | Product Registration       |
      | Product Information        |
      | Maintenance and Usage      |
      | General Question           |

  @TS03
  Scenario: Selecting the Product Registration form
    When user selects the dropdown button
    And user select Product Registration option
    And click Next button
    Then verify user sees Serial Id Text



