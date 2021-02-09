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

Feature: Въвеждане на оценка от преподавателя

  
  Scenario: Въвеждане на оценка от преподавателя
    Given Преподавателят стартира началния екран     
    When Преподавателя въвежда предмета си
    And Въвежда име на ученик "Ivan"
    And Въвежда оценка на съответния ученик "4"    
    And Натиска бутона за добавяне
    Then Виждаме съобщение "Success" 

  
  Scenario: Въвеждане на оценка от преподавателя без име на ученика
    Given Преподавателят стартира началния екран     
    When Преподавателя въвежда предмета си
    And Въвежда име на ученик ""
    And Въвежда оценка на съответния ученик "4"    
    And Натиска бутона за добавяне
    Then Виждаме съобщение "No student name"
    
     
  Scenario: Въвеждане на оценка от преподавателя без оценка на ученика
    Given Преподавателят стартира началния екран     
    When Преподавателя въвежда предмета си
    And Въвежда име на ученик "Ivan"
    And Въвежда оценка на съответния ученик ""    
    And Натиска бутона за добавяне
    Then Виждаме съобщение "No student rating"
    
    
  Scenario: Въвеждане на оценка по голяма от 6 от преподавателя
    Given Преподавателят стартира началния екран     
    When Преподавателя въвежда предмета си
    And Въвежда име на ученик "Ivan"
    And Въвежда оценка на съответния ученик "9"    
    And Натиска бутона за добавяне
    Then Виждаме съобщение "Not valid grade.Need to be under or equal to 6 and bigger or equal than 2 "
    
    
  Scenario: Въвеждане на оценка по малка от 2 от преподавателя
    Given Преподавателят стартира началния екран     
    When Преподавателя въвежда предмета си
    And Въвежда име на ученик "Ivan"
    And Въвежда оценка на съответния ученик "-2"    
    And Натиска бутона за добавяне
    Then Виждаме съобщение "Not valid grade.Need to be under or equal to 6 and bigger or equal than 2 "
 
