/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author leanh
 */
public class Login_Frm extends javax.swing.JFrame {

    public Login_Frm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Login = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        tf_phoneNumber = new javax.swing.JTextField();
        jBtn_Login = new javax.swing.JButton();
        jBtn_SignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Login.setForeground(new java.awt.Color(204, 0, 204));
        lbl_Login.setText("Đăng nhập");
        lbl_Login.setMaximumSize(new java.awt.Dimension(58, 20));

        tf_pass.setBackground(new java.awt.Color(204, 204, 255));
        tf_pass.setBorder(null);

        tf_phoneNumber.setBackground(new java.awt.Color(204, 204, 255));
        tf_phoneNumber.setBorder(null);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(tf_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
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
//        String phoneNumberStr = tf_phoneNumber.getText();
//        String pass = tf_pass.getText();
//        System.out.print(phoneNumberStr);
//        System.out.print(pass);
//        if(phoneNumberStr.isEmpty() || pass.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        }
//        else if(phoneNumberStr.matches(".*[a-zA-Z].*")){
//            JOptionPane.showMessageDialog(this, "Tên đăng nhập không chứa chữ cái", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        }
//        else if (containsSpecialCharacters(phoneNumberStr) || containsSpecialCharacters(pass)) {
//            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không được chứa ký tự chữ hoặc ký tự đặc biệt!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        }
//        else{
//            int phoneNumber = Integer.parseInt(phoneNumberStr);
//            boolean check = controller.login(phoneNumber, pass);
//            if(check){
//                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//                HomeStaff HomeStaffFrame = new HomeStaff();
//                HomeStaffFrame.setVisible(true);
//
//                nameAccount = phoneNumber;
//                password = pass;
//                this.setVisible(false);
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Sai số điện thoại hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            }
//        }

        //
        //
    }//GEN-LAST:event_jBtn_LoginActionPerformed

    private void jBtn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SignUpActionPerformed
//        //        this.dispose();
//        SignUp SignUpFrame = new SignUp();
//        SignUpFrame.setVisible(true);
//        this.setVisible(false);
        //        this.setVisible(false);

    }//GEN-LAST:event_jBtn_SignUpActionPerformed

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
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_phoneNumber;
    // End of variables declaration//GEN-END:variables
}
