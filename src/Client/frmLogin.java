/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nguyenphuduc
 */
public class frmLogin extends javax.swing.JFrame {

    private Socket socket = null;
    private PrintWriter out = null;
    private Scanner in = null;

    public static String USERNAME;
    public static String FULLNAME;
    public static int ROLES;

    public frmLogin() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        checkShow = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jLabel1.setFont(new java.awt.Font("#9Slide03 SFU Futura_07", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên đăng nhập");

        txtUser.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu");

        txtPass.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N

        checkShow.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N
        checkShow.setForeground(new java.awt.Color(255, 255, 255));
        checkShow.setText("Hiện mật khẩu");
        checkShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkShowActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 204, 102));
        btnLogin.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("#9Slide03 SFU Futura_03", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nếu chưa có tài khoản, vui lòng liên hệ quản trị viên.");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkShow, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkShow)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPass)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)))
                .addGap(6, 6, 6))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkShow)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkShowActionPerformed
        // TODO add your handling code here:
        if (checkShow.isSelected()) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkShowActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUser.getText().trim();
        String pass = String.valueOf(txtPass.getPassword()).trim();

        // nếu thông tin không đầy đủ
        if (username.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin đăng nhập!");
        } else {
            USERNAME = username;

            // nối thông tin gửi đi thành một chuỗi
            String inputString = StringHandling.StringHandling.stringSoncatenation("login", username, pass);

            // chuyển thông tin về dạng byte
            byte[] inputByte = inputString.getBytes(StandardCharsets.UTF_8);
            String inputBase64 = Base64.getEncoder().encodeToString(inputByte);

            // kết quả trả về tại đây
            String ketqua = "";

            try {
                // Socket nhận tham tham số là địa chỉ IP và Host
                socket = new Socket("127.0.0.1", 8888);
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new Scanner(socket.getInputStream());
                out.println(inputBase64);

                // lấy ra kết quả
                ketqua = String.valueOf(in.nextLine());
                
                String ketquaString = new String(Base64.getDecoder().decode(ketqua), StandardCharsets.UTF_8);
                
                String arrString[] = ketquaString.split("\n");

                
                if (!arrString[1].isEmpty()) {
                    FULLNAME = arrString[1];
                }
                
                // nếu đăng nhập thành công
                if (arrString[0].equals("1") || arrString[0].equals("2") || arrString[0].equals("3")) {
                    ROLES = Integer.parseInt(arrString[0]);
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                    frmMain frm = new frmMain();
                    frm.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, arrString[0]);
                }
                
                

                socket.close();
            } catch (IOException e) {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException ex) {
                }
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkShow;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
