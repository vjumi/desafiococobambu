package dataFactory;

import java.util.ArrayList;
import java.util.List;

import pageobjects.carrinhoPO;
import pageobjects.produtosPO;

/**
 * Page Factory do carrinho
 */

public class carrinhoDataFactory {

    /**
     * Adicionar 1 produto ao carrinho
     * @param id do produto
     * @param quantity do produto
     */


    public carrinhoPO add1produto(int id, int quantity){
       

        carrinhoPO addproduto = new carrinhoPO();
        addproduto.setUserId(1);
        
        List<produtosPO> produtos = new ArrayList<>();

        produtosPO primeiroProduto = new produtosPO();
        primeiroProduto.setId(id);
        primeiroProduto.setQuantity(quantity);

        produtos.add(primeiroProduto);

        addproduto.setProducts(produtos);

        return addproduto;

    }



    /**
     * Adicionar 2 produtos ao carrinho
     * @param id1 para definir o id primeiro produto
     * @param id2 para definir o id do segundo produto
     * @param quantity1 para definir a quantidade do primeiro produto
     * @param quantity2 para definir a quantidade do segundo produto
     */

    public carrinhoPO add2Produtos(int id1, int quantity1, int id2, int quantity2){

        carrinhoPO addprodutos = new carrinhoPO();
        addprodutos.setUserId(1);
        
        List<produtosPO> produtos = new ArrayList<>();

        produtosPO primeiroProduto = new produtosPO();
        primeiroProduto.setId(id1);
        primeiroProduto.setQuantity(quantity1);

        produtosPO segundoProduto = new produtosPO();
        segundoProduto.setId(id2);
        segundoProduto.setQuantity(quantity2);

        produtos.add(primeiroProduto);
        produtos.add(segundoProduto);

        addprodutos.setProducts(produtos);

        return addprodutos;

    }

    /**
     * Processo de adicionar produto ao carrinho sem o Id do usuário
     * @param id produto
     * @param quantity produto
     */

    public carrinhoPO addProduto_invalido(int id, int quantity){
       

        carrinhoPO addproduto = new carrinhoPO();
        
        List<produtosPO> produtos = new ArrayList<>();

        produtosPO primeiroProduto = new produtosPO();
        primeiroProduto.setId(id);
        primeiroProduto.setQuantity(quantity);

        produtos.add(primeiroProduto);

        addproduto.setProducts(produtos);

        return addproduto;

    }

    /**
     * Processo de alterar produto do carrinho
     * @param id do produto
     * @param quantity do produto
     * @return
     */

    public carrinhoPO alterarProduto(int id, int quantity){
         // Page Objects do body da funcionalidade alterar com sucesso

         carrinhoPO alterarProduto = new carrinhoPO();
         alterarProduto.setMerge(true);
 
         List<produtosPO> produtos = new ArrayList<>();
 
         produtosPO primeiroProduto = new produtosPO();
         primeiroProduto.setId(id);
         primeiroProduto.setQuantity(quantity);
         
 
         produtos.add(primeiroProduto);
 
         alterarProduto.setProducts(produtos);

         return alterarProduto;
    }

    /**
     * Processo de alterar produto do carrinho com merge Falso
     * @param id do produto
     * @param quantity do produto
     * @return
     */

     public carrinhoPO alterarProduto_MergeFalso(int id, int quantity){
        // Page Objects do body da funcionalidade alterar com sucesso

        carrinhoPO alterarProduto = new carrinhoPO();
        alterarProduto.setMerge(false);

        List<produtosPO> produtos = new ArrayList<>();

        produtosPO primeiroProduto = new produtosPO();
        primeiroProduto.setId(id);
        primeiroProduto.setQuantity(quantity);
        

        produtos.add(primeiroProduto);

        alterarProduto.setProducts(produtos);

        return alterarProduto;
   }


   /**
    * Processo de alterar 2 produtos do carrinho
    * @param id1 para definir o id primeiro produto
    * @param quantity1 para definir a quantidade do primeiro produto
    * @param id2 para definir o id segundo produto
    * @param quantity2 para definir a quantidade do segundo produto
    * @return
    */

     public carrinhoPO alterarDoisProdutos(int id1, int quantity1, int id2, int quantity2){
        // Page Objects do body da funcionalidade alterar com sucesso

        carrinhoPO alterarProdutos = new carrinhoPO();
        alterarProdutos.setMerge(true);

        List<produtosPO> produtos = new ArrayList<>();

        produtosPO primeiroProduto = new produtosPO();
        primeiroProduto.setId(id1);
        primeiroProduto.setQuantity(quantity1);

        produtosPO segundoProduto = new produtosPO();
        segundoProduto.setId(id2);
        segundoProduto.setQuantity(quantity2);
        

        produtos.add(primeiroProduto);

        alterarProdutos.setProducts(produtos);

        return alterarProdutos;
   }
    
}
