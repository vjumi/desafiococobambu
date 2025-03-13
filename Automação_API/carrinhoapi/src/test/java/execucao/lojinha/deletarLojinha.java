package execucao.lojinha;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

@DisplayName("Deletar produtos da lojinha do desafio Coco Bambu")
public class deletarLojinha {

     /**
     * Configuração para o acesso da página
     */

    @BeforeEach
    public void acessarSistema(){

         baseURI = "https://dummyjson.com";
         basePath = "/carts";

    }

    /**
     * Deletar produtos do carrinho com sucesso
     */

    @Test
    @DisplayName("Processo de deletar produtos no carrinho com sucesso")

    public void deletarProdutosnoCarrinho(){

        // BDD
        //capturando em Json a resposta do sistema

      Boolean produtoDeletado =  given()
        .contentType(ContentType.JSON)
        .when()
            .delete("/1")
        .then()
            .extract()
                .path("isDeleted");

        System.out.println("isDeleted: " + produtoDeletado);

        //validando a resposta

        given()
            .contentType(ContentType.JSON)
        .when()
            .delete("/1")
        .then()
            .assertThat()
                .body("isDeleted", equalTo(true))
                .statusCode(200);
    }

    /**
     * Deletar produtos do carrinho inválido por não conter item no carrinho do ID
     */


    @Test
    @DisplayName("Processo de deletar produtos no carrinho inválido")
    public void deletarProdutos_invalido(){

        // BDD
        //capturando em Json a resposta do sistema

      String mensagemErro =  given()
        .contentType(ContentType.JSON)
        .when()
            .delete("/51")
        .then()
            .extract()
                .path("message");

        System.out.println("Mensagem de erro: " + mensagemErro);

        //validando a resposta do erro

        given()
            .contentType(ContentType.JSON)
        .when()
            .delete("/51")
        .then()
            .assertThat()
                .body("message", equalTo("Cart with id '51' not found"))
                .statusCode(404);
    }




    
}
