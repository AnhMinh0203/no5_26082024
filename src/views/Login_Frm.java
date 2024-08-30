
package views;

import controllers.EmployeeController;
import javax.swing.JOptionPane;

/**
 *
 * @author leanh
 */
public class Login_Frm extends javax.swing.JFrame {
    private EmployeeController emp_controller;
    public static String nameAccount;
    public static String password;
    
    public Login_Frm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Login = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        tf_name_login = new javax.swing.JTextField();
        jBtn_Login = new javax.swing.JButton();
        jBtn_SignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Login.setForeground(new java.awt.Color(204, 0, 204));
        lbl_Login.setText("Đăng nhập");
        lbl_Login.setMaximumSize(new java.awt.Dimension(58, 10));

        tf_pass.setBackground(new java.awt.Color(204, 204, 255));
        tf_pass.setBorder(null);

        tf_name_login.setBackground(new java.awt.Color(204, 204, 255));
        tf_name_login.setBorder(null);
        tf_name_login.setName(""); // NOI18N
        tf_name_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_loginActionPerformed(evt);
            }
        });

        jBtn_Login.setText("Đăng nhập");
        jBtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LoginActionPerformed(evt);
            }
        });

        jBtn_SignUp.setText("Đăng ký");
        jBtn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SignUpActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên đăng nhập");

        jLabel2.setText("Mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_name_login, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_name_login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LoginActionPerformed
        String name_login = tf_name_login.getText();
        String pass = tf_pass.getText();
        emp_controller = new EmployeeController();
        if(name_login.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
//            int phoneNumber = Integer.parseInt(phoneNumberStr);
            boolean check = emp_controller.login(name_login, pass);
            if(check){
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                Home_Frm HomeStaffFrame = new Home_Frm();
                HomeStaffFrame.setVisible(true);

                nameAccount = name_login;
                password = pass;
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "Sai số điện thoại hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jBtn_LoginActionPerformed

    private void jBtn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SignUpActionPerformed
        //        this.dispose();
        SignUp_Frm SignUpFrame = new SignUp_Frm();
        SignUpFrame.setVisible(true);
        this.setVisible(false);
        this.setVisible(false);

    }//GEN-LAST:event_jBtn_SignUpActionPerformed

    private void tf_name_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_name_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Login;
    private javax.swing.JButton jBtn_SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JTextField tf_name_login;
    private javax.swing.JTextField tf_pass;
    // End of variables declaration//GEN-END:variables
}
