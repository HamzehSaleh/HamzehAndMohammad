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
Feature: Serach book 
@tag1 
Scenario Outline: without logged  in admin wants to search about substring of the title 
Given Admin without logged in and have the title for the book  
 When he entered the title <title>
 Then the book info will display by title 
 
 
  Examples: 
      | title |
      | "Data" |
      
   @tag2   
      Scenario Outline: without logged in admin wants to search about substring of the author 
Given Admin without logged in and have the author for the book  
 When he entered the author <author>
 Then the book info will display by author 
 
 
  Examples: 
      | author |
      | "Mohammad" |
      
      
      
      @tag3   
      Scenario Outline: without logged in admin wants to search about substring of the isbn 
Given Admin without logged in and have the isbn for the book  
 When he entered the isbn <isbn>
 Then the book info will display by isbn
 
 
  Examples: 
      | isbn |
      | "12345" |
      
      
       @tag4   
      Scenario Outline: logged in admin wants to search about book  
Given Admin with logged in and have any info for the book  
 When he entered the any info <any_info_one_book>
 Then the book info will display by any info
 
 
  Examples: 
      | any_info_one_book |
      | "12345" |
      
      
       @tag5   
      Scenario Outline: logged in admin wants to search about book and no match 
Given Admin with logged in and have any info for the book and no match 
 When he entered the any info to search and nothing to show <any_info_no_match>
 Then the book info will not display 
 
 
  Examples: 
      | any_info_no_match |
      | "12345" |
      
      
       @tag6   
      Scenario Outline: logged in admin wants to search about more than one book 
Given Admin with logged in and have any info for  more than one  book  
 When he entered the any info to search for more than one book <any_info_many_books>
 Then  more than one book info will display 
 
 
  Examples: 
      | any_info_many_books |
      | "12345" |
      
      