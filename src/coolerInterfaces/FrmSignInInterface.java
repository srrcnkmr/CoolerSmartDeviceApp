package coolerInterfaces;

import business.Abstract.ISignInValidator;
import business.Concrete.InternetUserManager;
import business.exception.RecordNotFoundException;
import business.observer.InternetUserObserver;
import business.validationRules.UserSignInValidator;
import entity.Concrete.InternetUser;
import java.awt.Color;
import java.awt.Toolkit;

public class FrmSignInInterface extends javax.swing.JFrame {
    
    ISignInValidator validator = null;
    int mousePositionX;
    int mousePositionY;
    InternetUser internetUser = null;
    InternetUserManager internetUserManager = null;
    
    public FrmSignInInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(470,560);
        this.setBackground(new Color(0,0,0,0));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/picture/coolerLogo_32.png")));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLogoCooler = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        btnOpenSignUpInterface = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblSignInError = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblHaveAccount = new javax.swing.JLabel();
        passPassword = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        btnSignIn = new javax.swing.JLabel();
        lblLogoName = new javax.swing.JLabel();
        lblLogoSignUp = new javax.swing.JLabel();
        dragLineSignIn = new javax.swing.JLabel();
        btnExitSignIn = new javax.swing.JLabel();
        btnMinimizeSignIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 560));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 18, 46));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 560));
        jPanel2.setPreferredSize(new java.awt.Dimension(470, 560));

        lblLogoCooler.setFont(new java.awt.Font("Segoe UI Historic", 1, 40)); // NOI18N
        lblLogoCooler.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoCooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCooler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/signInCoolerLogo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 32, 82));

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/passwordLogo.png"))); // NOI18N
        lblPassword.setText("Password:");

        btnOpenSignUpInterface.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnOpenSignUpInterface.setForeground(new java.awt.Color(204, 204, 204));
        btnOpenSignUpInterface.setText("Sign up");
        btnOpenSignUpInterface.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpenSignUpInterface.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenSignUpInterfaceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpenSignUpInterfaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOpenSignUpInterfaceMouseExited(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/usernameLogo.png"))); // NOI18N
        lblUsername.setText("Username:");
        lblUsername.setAutoscrolls(true);

        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblSignInError.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblSignInError.setForeground(new java.awt.Color(204, 0, 0));
        lblSignInError.setText(" ");

        txtUsername.setBackground(new java.awt.Color(0, 32, 82));
        txtUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.setOpaque(false);

        lblHaveAccount.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblHaveAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblHaveAccount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHaveAccount.setText("Already have an account?");

        passPassword.setBackground(new java.awt.Color(0, 32, 82));
        passPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passPassword.setForeground(new java.awt.Color(255, 255, 255));
        passPassword.setBorder(null);
        passPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        passPassword.setOpaque(false);

        jSeparator11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator11.setMinimumSize(new java.awt.Dimension(0, 400));

        btnSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignIn_last.png"))); // NOI18N
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(5, 5, 5)
                        .addComponent(txtUsername))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenSignUpInterface))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator9)
                    .addComponent(lblSignInError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnSignIn)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblSignInError)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHaveAccount)
                    .addComponent(btnOpenSignUpInterface))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblLogoName.setFont(new java.awt.Font("Segoe UI Historic", 1, 30)); // NOI18N
        lblLogoName.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoName.setText("COOLER INTERFACE");

        lblLogoSignUp.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        lblLogoSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoSignUp.setText("Sign in");

        dragLineSignIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragLineSignInMouseDragged(evt);
            }
        });
        dragLineSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragLineSignInMousePressed(evt);
            }
        });

        btnExitSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnExitSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExitSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exitLogo.png"))); // NOI18N
        btnExitSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitSignInMouseClicked(evt);
            }
        });

        btnMinimizeSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/minimizeLogo.png"))); // NOI18N
        btnMinimizeSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizeSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeSignInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogoSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLogoName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoCooler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dragLineSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMinimizeSignIn)
                .addGap(10, 10, 10)
                .addComponent(btnExitSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dragLineSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMinimizeSignIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExitSignIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addComponent(lblLogoCooler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblLogoSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void dragLineSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLineSignInMousePressed
        mousePositionX = evt.getX();
        mousePositionY = evt.getY();
    }//GEN-LAST:event_dragLineSignInMousePressed
    
    private void dragLineSignInMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLineSignInMouseDragged
        int coordinateX = evt.getXOnScreen();
        int coordinateY = evt.getYOnScreen();
        
        this.setLocation(coordinateX - mousePositionX, coordinateY - mousePositionY);
    }//GEN-LAST:event_dragLineSignInMouseDragged
    
    private void btnExitSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitSignInMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitSignInMouseClicked
    
    private void btnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseEntered
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignIn_first.png")));
    }//GEN-LAST:event_btnSignInMouseEntered
    
    private void btnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseExited
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignIn_last.png")));
    }//GEN-LAST:event_btnSignInMouseExited
    
    private void btnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseClicked
        internetUserManager = InternetUserManager.createAsSingleton();
        try {
            validator = UserSignInValidator.createAsSingleton();
            
            if(validator.validate(txtUsername.getText(),passPassword.getText())){
                internetUser = new InternetUser(0, 0, null, null, txtUsername.getText(), null, null, "Yes");
                internetUserManager.update(internetUser);
            }
            
          
            FrmNetworkInterface networkInterface = new FrmNetworkInterface();
            networkInterface.setVisible(true);
            dispose();
        } catch (RecordNotFoundException exception) {
            lblSignInError.setText("*" + exception.getMessage());
        }    
    }//GEN-LAST:event_btnSignInMouseClicked
    
    private void btnOpenSignUpInterfaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignUpInterfaceMouseEntered
        btnOpenSignUpInterface.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnOpenSignUpInterfaceMouseEntered
    
    private void btnOpenSignUpInterfaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignUpInterfaceMouseExited
        btnOpenSignUpInterface.setForeground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnOpenSignUpInterfaceMouseExited
    
    private void btnOpenSignUpInterfaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignUpInterfaceMouseClicked
        FrmSignUpInterface signUpInterface = new FrmSignUpInterface();
        signUpInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOpenSignUpInterfaceMouseClicked
    
    private void btnMinimizeSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeSignInMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeSignInMouseClicked
    
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
            java.util.logging.Logger.getLogger(FrmSignInInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSignInInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSignInInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSignInInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSignInInterface().setVisible(true);
            }
        });
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExitSignIn;
    private javax.swing.JLabel btnMinimizeSignIn;
    private javax.swing.JLabel btnOpenSignUpInterface;
    private javax.swing.JLabel btnSignIn;
    private javax.swing.JLabel dragLineSignIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblHaveAccount;
    private javax.swing.JLabel lblLogoCooler;
    private javax.swing.JLabel lblLogoName;
    private javax.swing.JLabel lblLogoSignUp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignInError;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField passPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
