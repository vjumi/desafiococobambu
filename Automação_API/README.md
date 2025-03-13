# Desafio Técnico Coco Bambu

## Automação API

Este repositório contém a prova técnica para a avaliação de QA Engineer Coco Bambu.
URLs: https://dummyjson.com/docs/carts#carts-add/, https://dummyjson.com/docs/carts#carts-update/, https://dummyjson.com/docs/carts#carts-delete/

## Requisitos

- **Java**: 17+ (JDK deve estar instalado)
- **Maven**
- **Junit**: 5.9.2
- **RestAssured**: 4.4.0
- **jackson-databind**: 2.12.3
- **Surefire**: 3.2.5

## Como Executar a Aplicação

1. Certifique-se de que possui o Maven instalado e configurado corretamente.
2. No terminal, navegue até a pasta raiz do projeto.
3. Execute o comando:

   ```bash
   mvn test

4. O Maven irá compilar o projeto e rodar todos os testes automaticamente
5. Os resultados serão exibidos no console, informando quais testes passaram ou falharam.
6. Acessar a pasta surefire-reports e abrir os relatórios dos testes


# Documentação Técnica da Aplicação
  
## Testes Realizados

### Adicionar Produtos ao Carrinho (adicionarLojinha.java)
- **Cadastro de Produto**
- **cadastrar_1ProdutonoCarrinho**: Efetuar o cadastro de 1 item no carrinho da conta.

- **cadastrar_2ProdutosnoCarrinhoo**: Efetuar o cadastro de 2 itens no carrinho da conta.

- **cadastroInvalido_ProdutosnoCarrinho**: Cadastro invalido de produtos ao carrinho por não possuir Id do usuário

### Alterar Produtos no Carrinho (alterarLojinha.java)
- **Alteração de Produto**
  - **alterar_ProdutonoCarrinho**: Alterar produto do carrinho com sucesso.

  - **alterar_2ProdutosnoCarrinho**: Alterar 2 produtos do carrinho com sucesso.

  - **alterar_Produto_MergeFalso**: Alterar produto no carrinho com sucesso com merge falso.

  - **alterar_produtoInvalido**: Alteração invalida de produtos pois ID do usuário não possui produto

  ### Deletar Produtos do Carrinho (deletarLojinha.java)
- **Exclusão de Produto**
  - **deletarProdutosnoCarrinho**: Deletar produtos do carrinho com sucesso.

  - **deletarProdutos_invalido**: Deletar produtos do carrinho inválido por não conter item no carrinho do ID.

## Arquivos de Configuração

- **Linguagem**: Java.
- **RestAssured**: Para automação de API.
- **JUnit 5**: para automação dos testes.

# Valmir Azevedo dos Santos Junior
# Março 2025
