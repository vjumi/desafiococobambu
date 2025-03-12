package pageobjects;

import java.util.List;

public class basePO {

    private int userId;
    private List<productsPO> products;
    private boolean merge;

    //Get

    public int getUserId(){
        return userId;
    }

    public List<productsPO> getProducts(){
        return products;
    }

    public boolean getMerge(){
        return merge;
    }

    //Set

    public void setUserId(int userId){
        this.userId = userId;
    }

    public void setProducts(List<productsPO> products) {
        this.products = products;
    }

    public void setMerge(boolean merge){
        this.merge = merge;
    }
    
}
