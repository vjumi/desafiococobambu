# Desafio Técnico Coco Bambu

## Automação UI

Este projeto utiliza Cypress para a automação de testes de interface do usuário no aplicativo Coco Bambu. Este repositório contém a prova técnica para a avaliação de QA Engineer Coco Bambu.
URLs: https://app-hom.cocobambu.com/

## Requisitos

- **Node.js**: versão 16 ou superior
- **NPM**: Para instalar dependências
- **Cypress**

## Como configurar o ambiente

1. Certifique-se de ter o Node.js instalado (versão recomendada: 16 ou superior).
2. Instale as dependências do projeto no terminal:

   ```bash
   npm install

## Como executar os testes automatizados

1. No terminal, rode o teste para visualizar a execução e não gerar relatório:
   
    ```bash
   npx cypress open

2. Escolha o navegador de sua escolha

3. Clique em "base.cy.js" para rodar todos os testes

4. Para gerar relatório Mochawesome, é preciso inserir o seguinte comando no terminal para executar os testes e visualizar no console:
   
    ```bash
   npx cypress run

5. Caso desejar executar um teste individual. Basta acessar a base e inserir: ".only" na frente do teste (it) desejado e executar com algum comando acima.


# Documentação Técnica da Aplicação
  
## Testes Realizados

### Login (Login.js)
- **Efetuar Login**
- **acessarSistema**: Função para acessar o sistema utilizando a baseUrl configurado no Cypress.

- **efetuarLogin**: Efetua o login de um perfil existente.

### Endereço fora da área de atendimento  (Endereco.js)
- **Endereço incorreto**
  - **acessarEndereco_Incorreto**: Validar a capacidade do aplicativo em disponibilizar informações exclusivamente para endereços válidos.

### Pagamento com Cartão de Crédito inválido (CartaodeCredito.js)
 **Número de cartão de crédito**

  - **nmrcartaodecredito_invalido**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão com 1(um) dígito a menos.

  - **nmrcartaodecredito_deletado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão e apagar em seguida.

  - **nmrcartaodecredito_naoSuportado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão não suportado

**Data de Validade**

  - **dataExpiracao_deletado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão e apagar.

  - **dataExpiracao_invalido**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão inválida.

  - **dataExpiracao_expirado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão já expirado.

  **Código de Segurança**

  - **CVV_deletado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o código de segurança e apagar a informação.

  - **CVV_invalido**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o código de segurança do cartão inválida.

  **Nome impresso no cartão**

  - **NomeTitular_deletado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o nome completo do titular do cartão e apagar a informação.

  - **NomeTitular_invalido**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o nome impresso no cartão inválida.

  **CPF/CNPJ**

  - **CPFouCNPJ_deletado**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o CPF do titular do cartão e apagar a informação.

  - **CPFouCNPJ_Invalido**: Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir CPF do titular do cartão inválido.

## Arquivos de Configuração

- **Linguagem**: JavaScript (Node.js).
- **Cypress**: Framework de testes automatizados para aplicações web.
- **Mocha + Chai**: Frameworks para estruturação e asserções de testes.
- **Mochawesome** Gerador de relatórios detalhados dos testes.

# Valmir Azevedo dos Santos Junior
# Março 2025
