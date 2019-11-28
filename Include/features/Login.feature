Feature: Fazer login em comercio online

  Scenario Outline: Usuario com login valido
    Given Entrar no site de comercio
    When Usar o <username> e  <password>
    And clicar no botão login
    Then Verificar login no site de comercio

    Examples: 
      | username                  | password                 |
      | sergioraibarros@gmail.com | PTM+HthrXXC0/rVN/jUwCg== |

  Scenario Outline: Usuario com login invalido
    Given Entrar no site de comercio
    When Usar o <username> e  <password>
    And clicar no botão login
    Then Verificar login no site de comercio

    Examples: 
      | username                    | password                 |
      | sergioraibarretos@gmail.com | PTM+HthrXXC0/rVN/jUwCg== |
