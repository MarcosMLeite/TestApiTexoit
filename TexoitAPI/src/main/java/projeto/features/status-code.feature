#Author: Marcos 

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  

  @tag2
  Scenario Outline: Title of your scenario outline
  
    Given que tenho acesso a API "https://jsonplaceholder.typicode.com/comments"
    When faço a consulta  com método GET
    Then valido  statuscode <status> e email <name>

    Examples: 
      | name  | value   | status  |
      | name1 | 200     | success |
      | name2 |         | Fail    |
