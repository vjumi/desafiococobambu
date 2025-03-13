package pageobjects;

import java.util.List;

/**
 * Page Objetics do carrinho
 */

public class carrinhoPO {

    private int userId;
    private List<produtosPO> products;
    private boolean merge;

    //Get

    public int getUserId(){
        return userId;
    }

    public List<produtosPO> getProducts(){
        return products;
    }

    public boolean getMerge(){
        return merge;
    }

    //Set

    public void setUserId(int userId){
        this.userId = userId;
    }

    public void setProducts(List<produtosPO> products) {
        this.products = products;
    }

    public void setMerge(boolean merge){
        this.merge = merge;
    }
    
}
