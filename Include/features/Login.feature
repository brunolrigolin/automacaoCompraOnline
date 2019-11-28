Feature: Fazer login em comercio online

  Scenario Outline: Usuario com login valido
    Given Entrar no site de comercio online
    When Usar o <username> e  <password>
    And clicar no botão login
    Then Verificar login no site de comercio online

    Examples: 
      | username                  | password                 |
      | sergioraibarros@gmail.com | PTM+HthrXXC0/rVN/jUwCg== |

  Scenario Outline: Usuario com login invalido
    Given Entrar no site de comercio online
    When Usar o <username> e  <password>
    And clicar no botão login
    Then Verificar login no site de comercio online

    Examples: 
      | username                    | password                 |
      | sergioraibarretos@gmail.com | PTM+HthrXXC0/rVN/jUwCg== |
