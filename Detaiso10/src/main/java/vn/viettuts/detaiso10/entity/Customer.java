package vn.viettuts.detaiso10.entity;


public class Customer {    
    private String tenkhachhang;
    private String ngaymua;
    private String sodienthoai;
    private String sanphammua;

    public Customer() {
    }

    public Customer(String tenkhachhang, String ngaymua, String sodienthoai, String sanphammua) {
        this.tenkhachhang = tenkhachhang;
        this.ngaymua = ngaymua;
        this.sodienthoai = sodienthoai;
        this.sanphammua = sanphammua;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getSanphammua() {
        return sanphammua;
    }

    public void setSanphammua(String sanphammua) {
        this.sanphammua = sanphammua;
    }
    
}
