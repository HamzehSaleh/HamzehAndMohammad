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
Feature: Adding a new book 

@tag1 
 Scenario Outline: logged in admin wants to add a book 
 Given Admin logged in and have the information for the book 
 When he entered the title <title>
 And he entered the auther <author>
 And he entered the sign <sign>
 And he entered the isbn <isbn>
 Then the book is added 
 
 
  Examples: 
      | title | author |  sign | isbn| 
      | "Data" | "NoOne"| "10" |  "12345"| 
     
 