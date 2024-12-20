Feature: Error message for empty fields during registration

  Scenario: Error message for empty fields
    Given the user is on the user registration page
    When the user clicks the Register button with all fields empty
    Then the error "Please fill out this field." should appear below the Username textbox

  Scenario: Error message for empty Password and Password confirmation fields
    Given the user is on the user registration page
    When the user clicks the Register button with all fields empty
    Then the error message "Please fill out this field." should appear below the Password textbox
    And the error message "Please fill out this field." should appear below the Password confirmation textbox
