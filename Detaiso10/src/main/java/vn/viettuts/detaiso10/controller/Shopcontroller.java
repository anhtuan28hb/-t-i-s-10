package vn.viettuts.detaiso10.controller;



import vn.viettuts.detaiso10.dao.Shopdao;
import vn.viettuts.detaiso10.view.Shopview;


public class Shopcontroller {
    private final Shopdao shopdao;
    private final Shopview shopview;
    public Shopcontroller(Shopview shopview){
        this.shopview=shopview;
        shopdao= new Shopdao();
        
    }
    public void showShopview(){
        shopview.setVisible(true);
    }
    
}
