
package vn.viettuts.detaiso10.view;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import vn.viettuts.detaiso10.controller.ChuyenItem;
import vn.viettuts.detaiso10.controller.Menu;

//import java.util.List;
////import objectlist.detai10.ChuyenItem;
////import objectlist.detai10.Menu;

public class Shopview extends javax.swing.JFrame {

    
    public Shopview() {
        initComponents();
        ChuyenItem chuyen = new ChuyenItem(jpnView);
        chuyen.setView(jpnSanpham, jbtSanpham);
        List<Menu> listItem = new ArrayList<>();
        listItem.add(new Menu("sanpham" , jpnSanpham, jbtSanpham));
        listItem.add(new Menu("muahang", jpnMuahang, jbtMuahang));
        listItem.add(new Menu("khachhang", jpnKhachhang, jbtKhachhang));
        listItem.add(new Menu("thongke", jpnThongke, jbtThongke));
        listItem.add(new Menu("danhgia", jpnDanhgia, jbtDangxuat));
        listItem.add(new Menu("mota", jpnMota, jbtMota));
        listItem.add(new Menu("dangxuat", jpnDangxuat, jbtDangxuat));
        listItem.add(new Menu("help", jpnHelp, jbtHelp));      
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnMuahang = new javax.swing.JPanel();
        jbtMuahang = new javax.swing.JButton();
        jpnSanpham = new javax.swing.JPanel();
        jbtSanpham = new javax.swing.JButton();
        jpnKhachhang = new javax.swing.JPanel();
        jbtKhachhang = new javax.swing.JButton();
        jpnThongke = new javax.swing.JPanel();
        jbtThongke = new javax.swing.JButton();
        jpnDanhgia = new javax.swing.JPanel();
        jbtDanhgia = new javax.swing.JButton();
        jpnMota = new javax.swing.JPanel();
        jbtMota = new javax.swing.JButton();
        jpnDangxuat = new javax.swing.JPanel();
        jbtDangxuat = new javax.swing.JButton();
        jpnHelp = new javax.swing.JPanel();
        jbtHelp = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(204, 204, 204));
        jpnRoot.setLayout(null);

        jpnMenu.setBackground(new java.awt.Color(51, 204, 255));

        jpnHome.setBackground(new java.awt.Color(52, 140, 218));
        jpnHome.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbHome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_home_white_24dp.png"))); // NOI18N
        jlbHome.setText("Màn hình chính");
        jlbHome.setPreferredSize(new java.awt.Dimension(180, 100));

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlbHome.getAccessibleContext().setAccessibleName("");

        jpnMuahang.setBackground(new java.awt.Color(52, 140, 218));
        jpnMuahang.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtMuahang.setBackground(new java.awt.Color(52, 140, 218));
        jbtMuahang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtMuahang.setForeground(new java.awt.Color(255, 255, 255));
        jbtMuahang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_add_shopping_cart_white_24dp.png"))); // NOI18N
        jbtMuahang.setText("Mua hàng");
        jbtMuahang.setPreferredSize(new java.awt.Dimension(180, 55));

        javax.swing.GroupLayout jpnMuahangLayout = new javax.swing.GroupLayout(jpnMuahang);
        jpnMuahang.setLayout(jpnMuahangLayout);
        jpnMuahangLayout.setHorizontalGroup(
            jpnMuahangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMuahangLayout.createSequentialGroup()
                .addComponent(jbtMuahang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnMuahangLayout.setVerticalGroup(
            jpnMuahangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMuahangLayout.createSequentialGroup()
                .addComponent(jbtMuahang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jpnSanpham.setBackground(new java.awt.Color(52, 140, 218));
        jpnSanpham.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtSanpham.setBackground(new java.awt.Color(52, 140, 218));
        jbtSanpham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtSanpham.setForeground(new java.awt.Color(255, 255, 255));
        jbtSanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_storefront_white_24dp.png"))); // NOI18N
        jbtSanpham.setText("Sản phẩm");
        jbtSanpham.setPreferredSize(new java.awt.Dimension(180, 55));
        jbtSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSanphamMouseClicked(evt);
            }
        });
        jbtSanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSanphamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnSanphamLayout = new javax.swing.GroupLayout(jpnSanpham);
        jpnSanpham.setLayout(jpnSanphamLayout);
        jpnSanphamLayout.setHorizontalGroup(
            jpnSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnSanphamLayout.setVerticalGroup(
            jpnSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnKhachhang.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtKhachhang.setBackground(new java.awt.Color(52, 140, 218));
        jbtKhachhang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtKhachhang.setForeground(new java.awt.Color(255, 255, 255));
        jbtKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_perm_identity_white_24dp.png"))); // NOI18N
        jbtKhachhang.setText("Khách hàng");

        javax.swing.GroupLayout jpnKhachhangLayout = new javax.swing.GroupLayout(jpnKhachhang);
        jpnKhachhang.setLayout(jpnKhachhangLayout);
        jpnKhachhangLayout.setHorizontalGroup(
            jpnKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnKhachhangLayout.setVerticalGroup(
            jpnKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnThongke.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtThongke.setBackground(new java.awt.Color(52, 140, 218));
        jbtThongke.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtThongke.setForeground(new java.awt.Color(255, 255, 255));
        jbtThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_paid_white_24dp.png"))); // NOI18N
        jbtThongke.setText("Thống kê");
        jbtThongke.setPreferredSize(new java.awt.Dimension(180, 55));

        javax.swing.GroupLayout jpnThongkeLayout = new javax.swing.GroupLayout(jpnThongke);
        jpnThongke.setLayout(jpnThongkeLayout);
        jpnThongkeLayout.setHorizontalGroup(
            jpnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtThongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThongkeLayout.setVerticalGroup(
            jpnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnDanhgia.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtDanhgia.setBackground(new java.awt.Color(52, 140, 218));
        jbtDanhgia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtDanhgia.setForeground(new java.awt.Color(255, 255, 255));
        jbtDanhgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_recommend_white_24dp.png"))); // NOI18N
        jbtDanhgia.setText("Đánh giá");
        jbtDanhgia.setPreferredSize(new java.awt.Dimension(180, 55));

        javax.swing.GroupLayout jpnDanhgiaLayout = new javax.swing.GroupLayout(jpnDanhgia);
        jpnDanhgia.setLayout(jpnDanhgiaLayout);
        jpnDanhgiaLayout.setHorizontalGroup(
            jpnDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtDanhgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnDanhgiaLayout.setVerticalGroup(
            jpnDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtDanhgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnMota.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtMota.setBackground(new java.awt.Color(52, 140, 218));
        jbtMota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtMota.setForeground(new java.awt.Color(255, 255, 255));
        jbtMota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_error_outline_white_24dp.png"))); // NOI18N
        jbtMota.setText("About store");
        jbtMota.setPreferredSize(new java.awt.Dimension(180, 5));
        jbtMota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMotaLayout = new javax.swing.GroupLayout(jpnMota);
        jpnMota.setLayout(jpnMotaLayout);
        jpnMotaLayout.setHorizontalGroup(
            jpnMotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtMota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMotaLayout.setVerticalGroup(
            jpnMotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtMota, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jpnDangxuat.setPreferredSize(new java.awt.Dimension(180, 55));

        jbtDangxuat.setBackground(new java.awt.Color(52, 140, 218));
        jbtDangxuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtDangxuat.setForeground(new java.awt.Color(255, 255, 255));
        jbtDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_reply_white_24dp.png"))); // NOI18N
        jbtDangxuat.setText("Đăng xuất");
        jbtDangxuat.setPreferredSize(new java.awt.Dimension(180, 55));
        jbtDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnDangxuatLayout = new javax.swing.GroupLayout(jpnDangxuat);
        jpnDangxuat.setLayout(jpnDangxuatLayout);
        jpnDangxuatLayout.setHorizontalGroup(
            jpnDangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtDangxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnDangxuatLayout.setVerticalGroup(
            jpnDangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtDangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnHelp.setPreferredSize(new java.awt.Dimension(180, 79));

        jbtHelp.setBackground(new java.awt.Color(52, 140, 218));
        jbtHelp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtHelp.setForeground(new java.awt.Color(255, 255, 255));
        jbtHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outline_help_white_24dp.png"))); // NOI18N
        jbtHelp.setText("Help");

        javax.swing.GroupLayout jpnHelpLayout = new javax.swing.GroupLayout(jpnHelp);
        jpnHelp.setLayout(jpnHelpLayout);
        jpnHelpLayout.setHorizontalGroup(
            jpnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHelpLayout.setVerticalGroup(
            jpnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMuahang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDanhgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnMuahang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDanhgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnRoot.add(jpnMenu);
        jpnMenu.setBounds(0, 0, 180, 620);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jpnRoot.add(jpnView);
        jpnView.setBounds(190, 10, 1030, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSanphamActionPerformed

    private void jbtMotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtMotaActionPerformed

    private void jbtDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangxuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtDangxuatActionPerformed

    private void jbtSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSanphamMouseClicked
                    
    }//GEN-LAST:event_jbtSanphamMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Shopview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtDangxuat;
    private javax.swing.JButton jbtDanhgia;
    private javax.swing.JButton jbtHelp;
    private javax.swing.JButton jbtKhachhang;
    private javax.swing.JButton jbtMota;
    private javax.swing.JButton jbtMuahang;
    private javax.swing.JButton jbtSanpham;
    private javax.swing.JButton jbtThongke;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JPanel jpnDangxuat;
    private javax.swing.JPanel jpnDanhgia;
    private javax.swing.JPanel jpnHelp;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnKhachhang;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnMota;
    private javax.swing.JPanel jpnMuahang;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSanpham;
    private javax.swing.JPanel jpnThongke;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
