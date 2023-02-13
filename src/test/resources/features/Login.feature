Feature: Login as different users
  User will be able to login as different users (for example as  admin, mentot  and student), also in this
  feature will be covered unsuccessfully login attempts and error messages

  Scenario: Check admin logs in successfully
    Then Click on SignIn button
    Given Login as an "admin"
    Then Validate that the admin is loged successfully

