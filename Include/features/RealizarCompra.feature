Feature: Realizar Compra

  Scenario Outline: Realizar compra de um Smartphone e encontrar o produto
    Given Procurar um produto e adicionar no carrinho
    When Fazer login com <username> e <password> e procurar <produto> na loja
    And Verificar produto
    And Escolher e Adicionar no carrinho
    Then Verificar produto no carrinho

    Examples: 
      | username                  | password                 | produto    |
      | sergioraibarros@gmail.com | PTM+HthrXXC0/rVN/jUwCg== | Galaxy s10 |

  Scenario Outline: Realizar compra de um Smartphone e não encontrar o produto
    Given Procurar um produto e adicionar no carrinho
    When Fazer login com <username> e <password> e procurar <produto> na loja
    And Verificar produto
    And Escolher e Adicionar no carrinho
    Then Verificar produto no carrinho

    Examples: 
      | username                  | password                 | produto    |
      | sergioraibarros@gmail.com | PTM+HthrXXC0/rVN/jUwCg== | Galaxy s9  |
