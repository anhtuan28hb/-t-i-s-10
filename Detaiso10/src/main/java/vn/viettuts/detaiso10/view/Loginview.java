package vn.viettuts.detaiso10.view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import vn.viettuts.detaiso10.controller.Logincontroller;
import vn.viettuts.detaiso10.entity.User;

public class Loginview extends javax.swing.JFrame {

    public Loginview() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        anh1label = new javax.swing.JLabel();
        welcomelabel = new javax.swing.JLabel();
        namestorelabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginlabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        usernametextfield = new javax.swing.JTextField();
        passwordtextfield = new javax.swing.JTextField();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(18, 151, 240));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 500));

        anh1label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove-bg.ai_1711792579411.png"))); // NOI18N

        welcomelabel.setFont(new java.awt.Font(".VnSouthernH", 1, 24)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomelabel.setText("welcome to");

        namestorelabel.setFont(new java.awt.Font(".VnSouthernH", 1, 36)); // NOI18N
        namestorelabel.setForeground(new java.awt.Color(255, 255, 255));
        namestorelabel.setText("the shoes store");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(welcomelabel)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(namestorelabel)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(anh1label, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(anh1label, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(welcomelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namestorelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 400, 500);

        jPanel1.setBackground(new java.awt.Color(240, 240, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginlabel.setBackground(new java.awt.Color(255, 255, 255));
        loginlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginlabel.setForeground(new java.awt.Color(18, 151, 240));
        loginlabel.setText("Đăng nhập");

        usernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(18, 151, 240));
        usernamelabel.setText("Email:");

        passwordlabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(18, 151, 240));
        passwordlabel.setText("Mật Khẩu:");

        usernametextfield.setPreferredSize(new java.awt.Dimension(370, 40));
        usernametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextfieldActionPerformed(evt);
            }
        });

        passwordtextfield.setPreferredSize(new java.awt.Dimension(370, 40));
        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });

        loginbutton.setBackground(new java.awt.Color(18, 151, 240));
        loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Xác nhận");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginlabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernamelabel)
                                .addComponent(passwordlabel)
                                .addComponent(usernametextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(passwordtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(loginbutton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(loginlabel)
                .addGap(18, 18, 18)
                .addComponent(usernamelabel)
                .addGap(18, 18, 18)
                .addComponent(usernametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordlabel)
                .addGap(18, 18, 18)
                .addComponent(passwordtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginbutton)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
//GEN-FIRST:event_passworldtextfieldActionPerformed
        String password = passwordtextfield.getText();
        if (password.equals("b10d54attt")) {
            passwordtextfield.setText(password);
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu sai !!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            passwordtextfield.setText("");
            passwordtextfield.requestFocus();
        }                                                  
    }//GEN-LAST:event_passworldtextfieldActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        String username = usernametextfield.getText();
        String password = passwordtextfield.getText();
        if (username.equals("@admindetai10") && password.equals("b10d54attt")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu sai!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            usernametextfield.setText("");
            passwordtextfield.setText("");
            usernametextfield.requestFocus();
        }

    }//GEN-LAST:event_loginbuttonActionPerformed

    private void usernametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextfieldActionPerformed
        // TODO add your handling code here:
        String username = usernametextfield.getText();
        if (username.equals("@admindetai10")) {
            usernametextfield.setText(username);
        } else {
            JOptionPane.showMessageDialog(this, "Email sai !!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            usernametextfield.setText("");
            usernametextfield.requestFocus();
        }
    }//GEN-LAST:event_usernametextfieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh1label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JLabel namestorelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField passwordtextfield;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametextfield;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables

    public User getUser() {
        return new User(usernametextfield.getText(),
                String.copyValueOf(passwordtextfield.getText().toCharArray()));
    }

    public void addLoginListener(Logincontroller.LoginListener loginListener) {
        loginbutton.addActionListener(loginListener);

    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void actionPerformed(ActionEvent e) {
    }

}
