Feature: Login

  Scenario: Clerk logging in
    When the clerk visits login page 
    And enters "clerk" and "password"
    Then the clerk sees clerk's home page
     @RunThis
  Scenario: Student logging in
    When the student visits login page 
    And enters wrong username and password
    Then the student sees login error message