#Author: jonathan.marin@sophossolutions.com

@tag
Feature: Busqueda en Google
  Jonathan como un usuario quiere poder entrar a google y buscar una palabra
  
  @SmokeTest
  Scenario: Busqueda Exitosa
    Given Que Jonathan esta en la pagina de google
    When busca la palabra "quesito"
    Then deberia ver el resultado de wikipedia
    

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #  Given I want to write a step with <name>
 #   When I check for the <value> in step
 #  Then I verify the <status> in step

 #  Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
