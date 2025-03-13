package execucao.lojinha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dataFactory.carrinhoDataFactory;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import java.util.ArrayList;

@DisplayName("Adicionar produtos da lojinha do desafio Coco Bambu")
public class adicionarLojinha{


    /**
     * Configuração para o acesso da página
     */

    @BeforeEach
    public void acessarSistema(){

         baseURI = "https://dummyjson.com";
         basePath = "/carts";

    }

    /**
    * Efetuar o cadastro de 1 item no carrinho da conta
    */

    @Test
    @DisplayName("Processo de adicionar produto no carrinho")

    public void cadastrar_1ProdutonoCarrinho(){

        // PageFactory para adicionar carrinho com sucesso
        carrinhoDataFactory carrinho = new carrinhoDataFactory();

        // BDD
        //capturando resposta Json das informacoes do produto

        ArrayList produtoAdicionado = given()
            .contentType(ContentType.JSON)
            .body(carrinho.add1produto(100, 1))
        .when()
            .post("/add")
        .then()
            .extract()
            .path("products.title");

         System.out.println("Produto adicionado: " + produtoAdicionado);
    }



    /**
    * Efetuar o cadastro de 2 itens no carrinho da conta
    */

    @Test
    @DisplayName("Processo de adicionar produtos no carrinho")

    public void cadastrar_2ProdutosnoCarrinho(){

        // PageFactory para adicionar carrinho com sucesso
        carrinhoDataFactory carrinho = new carrinhoDataFactory();

        // BDD
        //capturando resposta Json das informacoes do produto

        ArrayList produtosAdicionados = given()
            .contentType(ContentType.JSON)
            .body(carrinho.add2Produtos(144, 1, 98, 4))
        .when()
            .post("/add")
        .then()
            .extract()
            .path("products.title");

         System.out.println("Produtos adicionados: " + produtosAdicionados);
    }

    /**
    * Cadastro invalido de produtos ao carrinho por não possuir Id do usuário
    */

    @Test
    @DisplayName("Processo de cadastro inválido dos produtos no carrinho")

    public void cadastroInvalido_ProdutosnoCarrinho(){

        // PageFactory para adicionar carrinho invalido
        carrinhoDataFactory carrinho = new carrinhoDataFactory();

        // BDD
        // capturando resposta Json a mensagem de erro

        String mensagemErro = 
    given()
        .contentType(ContentType.JSON)
        .body(carrinho.addProduto_invalido(144, 5))
    .when()
        .post("/add")
    .then()
        .extract()
            .path("message");

    System.out.println("Mensagem de erro: " + mensagemErro);

     // Validando o retorno 400

        given()
            .contentType(ContentType.JSON)
            .body(carrinho.addProduto_invalido(144, 5))
        .when()
            .post("/add")
        .then()
            .assertThat()
                .body("message", equalTo("User id is required"))
                 .statusCode(400);
}

    
}