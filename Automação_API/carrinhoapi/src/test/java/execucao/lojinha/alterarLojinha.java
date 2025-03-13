package execucao.lojinha;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dataFactory.carrinhoDataFactory;
import io.restassured.http.ContentType;

@DisplayName("Alterar lojinha do desafio Coco Bambu")
public class alterarLojinha {

    /**
     * Configuração para o acesso da página
     */

    @BeforeEach
    public void acessarSistema(){

         baseURI = "https://dummyjson.com";
         basePath = "/carts";

    }
    
    /**
     * Alterar produto do carrinho com sucesso
     */

    @Test
    @DisplayName("Processo de alterar produto no carrinho com sucesso")

    public void alterar_ProdutonoCarrinho(){

       // PageFactory para alterar carrinho

       carrinhoDataFactory carrinho = new carrinhoDataFactory();

        // BDD
        // Validando o retorno 200

        given()
            .contentType(ContentType.JSON)
            .body(carrinho.alterarProduto(144, 5))
    .when()
        .put("/1")
    .then()
        .assertThat()
            .body("totalQuantity", equalTo(20))
            .statusCode(200);
    }



     /**
     * Alterar 2 produtos do carrinho com sucesso
     */

     @Test
     @DisplayName("Processo de alterar 2 produtos no carrinho com sucesso")
 
     public void alterar_2ProdutosnoCarrinho(){
 
        // PageFactory para alterar carrinho
 
        carrinhoDataFactory carrinho = new carrinhoDataFactory();
 
         // BDD
         // Validando o retorno 200
 
         given()
             .contentType(ContentType.JSON)
             .body(carrinho.alterarDoisProdutos(100, 15, 144, 5))
     .when()
         .put("/1")
     .then()
         .assertThat()
             .body("totalQuantity", equalTo(25))
             .statusCode(200);
     }

     /**
     * Alterar produto do carrinho com sucesso com merge falso
     */

    @Test
    @DisplayName("Processo de alterar produto no carrinho com sucesso com merge falso")

    public void alterar_Produto_MergeFalso(){

       // PageFactory para alterar carrinho

       carrinhoDataFactory carrinho = new carrinhoDataFactory();

        // BDD
        // Validando o retorno 200

        given()
            .contentType(ContentType.JSON)
            .body(carrinho.alterarProduto_MergeFalso(144, 5))
    .when()
        .put("/1")
    .then()
        .assertThat()
            .body("totalProducts", equalTo(1))
            .statusCode(200);
    }

     


     /**
     * Alteração invalida de produtos pois ID do usuário não possui produto
     */

     @Test
     @DisplayName("Processo de alteração invalida por não conter produto no carrinho")
 
     public void alterar_produtoInvalido(){
 
        // PageFactory para alterar carrinho
 
        carrinhoDataFactory carrinho = new carrinhoDataFactory();
 
         // BDD
         // Validando o retorno 200
 
         given()
             .contentType(ContentType.JSON)
             .body(carrinho.alterarDoisProdutos(100, 15, 144, 5))
     .when()
         .put("/51")
     .then()
         .assertThat()
             .body("message", equalTo("Cart with id '51' not found"))
             .statusCode(404);
     }


}
