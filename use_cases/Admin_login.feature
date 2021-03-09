#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: LogIn

@tag1
 
  Scenario Outline: Admin can log in with valid credentails
    Given I have the username <username>
    And I have the password <password>
    When I check if the user name and password are correct 
    Then I have logged in
    

    Examples: 
      | username | password |
      | "hamzeh" |     "hhh"| 
      
      @tag2
      
      Scenario Outline: Admin has the wrong password
       Given I have the username but i have a wrong password 
    When I check if the password <password> is wrong 
    Then Not valid information 
    
      Examples: 
      | password |
      |  "123" | 
