package vn.viettuts.detaiso10;
import vn.viettuts.detaiso10.controller.Logincontroller;
import vn.viettuts.detaiso10.view.Loginview;
import vn.viettuts.detaiso10.view.Shopview;
public class App {
    public static void main(String args[]) {
        Shopview n = new Shopview();
        Loginview m = new Loginview();
        n.show();
        m.show();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Loginview view= new Loginview();
                Logincontroller controller = new Logincontroller(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}
