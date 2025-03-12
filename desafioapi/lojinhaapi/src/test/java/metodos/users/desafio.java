package metodos.users;

import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import pageobjects.basePO;
import pageobjects.productsPO;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Desafio Coco Bambu")
public class desafio{

    @BeforeEach
    public void acessarSistema(){

         // Configurar acesso a página do teste

         baseURI = "https://dummyjson.com";
         basePath = "/carts";

    }

    @Test
    @DisplayName("Processo de adicionar produtos no carrinho")

    public void adicionarProdutosnoCarrinho(){

        // Page Objects para o body

        basePO basePO = new basePO();
        basePO.setUserId(1);
        
        List<productsPO> produtos = new ArrayList<>();

        productsPO produtoPO = new productsPO();
        produtoPO.setId(144);
        produtoPO.setQuantity(4);

        produtos.add(produtoPO);

        basePO.setProducts(produtos);

        //Cadastrar produtos ao carrinho

        ArrayList produtosAdicionados = given()
            .contentType(ContentType.JSON)
            .body(basePO)
        .when()
            .post("/add")
        .then()
            .extract()
             .path("products");
         System.out.println(produtosAdicionados);
    }

    @Test
    @DisplayName("Processo de alterar produtos no carrinho")

    public void alterarProdutosnoCarrinho(){

         // Page Objects para o body

        basePO basePO = new basePO();
        basePO.setMerge(true);

        List<productsPO> produtos = new ArrayList<>();

        productsPO produtoPO = new productsPO();
        produtoPO.setId(144);
        produtoPO.setQuantity(5);

        produtos.add(produtoPO);

        basePO.setProducts(produtos);

        //alterar produto no carrinho

        given()
            .contentType(ContentType.JSON)
            .body(basePO)
    .when()
        .put("/1")
    .then()
        .assertThat()
            .body("totalQuantity", equalTo(20))
            .statusCode(200);
    }

        //Deletar produto no carrinho

    @Test
    @DisplayName("Processo de deletar produtos no carrinho")

    public void deletarProdutosnoCarrinho(){

        //excluir produto no carrinho

      Boolean produtoDeletado =  given()
        .contentType(ContentType.JSON)
        .when()
            .delete("/1")
        .then()
            .extract()
                .path("isDeleted");

        System.out.println(produtoDeletado);
    }
}
