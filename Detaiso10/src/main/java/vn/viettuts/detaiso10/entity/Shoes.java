package vn.viettuts.detaiso10.entity;

public class Shoes {

    private String ten, mau; 
    private int size, gia;

    public Shoes() {
    }

    public Shoes(String ten, String mau, int size, int gia) {
        this.ten = ten;
        this.mau = mau;
        this.size = size;
        this.gia = gia;
    }
//get va set cac thuoc tinh
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

}
