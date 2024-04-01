package vn.viettuts.detaiso10.entity;

import java.util.List;
import java.util.ArrayList;

public class Orders {

    private int madh;  // ma don hang
    private Customer khachhang;  // khach hang
    private List<Shoes> DSG;  // danh sach giay
      // tong gia tri cua don hang

    public Orders() {
    }

    public Orders(int madh, Customer khachhang) {
        this.madh = madh;
        this.khachhang = khachhang;
        this.DSG= new ArrayList<>();
    }
//get va set cho cac thuoc tinh
    public int getMadh() {
        return madh;
    }

    public void setMadh(int madh) {
        this.madh = madh;
    }

    public Customer getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Customer khachhang) {
        this.khachhang = khachhang;
    }

    public List<Shoes> getDSG() {
        return DSG;
    }

    public void setDSG(List<Shoes> DSG) {
        this.DSG = DSG;
    }
// cac phuong thuc khac
    public void themgiay(Shoes giay){
        DSG.add(giay);
    }
}
