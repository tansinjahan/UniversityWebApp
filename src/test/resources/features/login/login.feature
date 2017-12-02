Feature: Login
 @RunThis
  Scenario: Clerk logging in
    When the clerk visits login page 
    And enters "clerk" and "password"
    Then the clerk sees clerk's home page
  Scenario: Student logging in
    When the student visits login page 
    And enters username and password
    Then the student sees student's home page