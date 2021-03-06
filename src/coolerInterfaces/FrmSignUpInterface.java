package coolerInterfaces;

import business.Abstract.IEmailValidator;
import business.Abstract.ISignUpValidator;
import business.Concrete.ActuatorManager;
import business.Concrete.CentralProcessorUnitManager;
import business.Concrete.CoolerManager;
import business.exception.EmailConstraintException;
import business.exception.NameLengthException;
import java.sql.SQLException;
import business.Concrete.InternetUserManager;
import business.Concrete.PasswordManager;
import business.Concrete.TemperatureSensorManager;
import business.exception.UniqueEntityException;
import business.validationRules.ActuatorValidator;
import business.validationRules.CentralProcessorUnitValidator;
import business.validationRules.CoolerProductIdValidator;
import business.validationRules.EmailSignUpValidator;
import business.validationRules.FirstNameSignUpValidator;
import business.validationRules.LastNameSignUpValidator;
import business.validationRules.PasswordSignUpValidator;
import business.validationRules.TemperatureSensorValidator;
import business.validationRules.UsernameSignUpValidator;
import entity.Concrete.Actuator;
import entity.Concrete.CentralProcessorUnit;
import entity.Concrete.Cooler;
import entity.Concrete.InternetUser;
import entity.Concrete.TemperatureSensor;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmSignUpInterface extends javax.swing.JFrame {
    
    private ISignUpValidator signUpValidator;
    private IEmailValidator emailValidator;
    
    private InternetUserManager internetUserManager;
    private PasswordManager passwordManager;
    private CoolerManager coolerManager;
    private ActuatorManager actuatorManager;
    private CentralProcessorUnitManager centralProcessorUnitManager;
    private TemperatureSensorManager temperatureSensorManager;
    
    private InternetUser internetUser;
    private Cooler cooler;
    private Actuator actuator;
    private CentralProcessorUnit centralProcessorUnit;
    private TemperatureSensor temperatureSensor;
    
    int mousePositionX;
    int mousePositionY;
    
    public FrmSignUpInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1040,570);
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
        jSeparator8 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnOpenSignInInterface = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblSignUpMessage = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lblFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblHaveAccount = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        passPassword = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        btnSignUp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblProductId = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtProductId = new javax.swing.JTextField();
        lblLogoName = new javax.swing.JLabel();
        lblLogoName1 = new javax.swing.JLabel();
        btnExitSignUp = new javax.swing.JLabel();
        dragLineSignUp = new javax.swing.JLabel();
        btnMinimizeSignUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 550));
        setName("frmSignUp"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1020, 550));

        jPanel2.setBackground(new java.awt.Color(0, 18, 46));
        jPanel2.setMinimumSize(new java.awt.Dimension(1002, 550));

        lblLogoCooler.setFont(new java.awt.Font("Segoe UI Historic", 1, 40)); // NOI18N
        lblLogoCooler.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoCooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCooler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/signUpLogo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 32, 82));

        jSeparator8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtUsername.setBackground(new java.awt.Color(0, 32, 82));
        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.setOpaque(false);

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/passwordLogo.png"))); // NOI18N
        lblPassword.setText("Password:");

        btnOpenSignInInterface.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnOpenSignInInterface.setForeground(new java.awt.Color(204, 204, 204));
        btnOpenSignInInterface.setText("Sign in");
        btnOpenSignInInterface.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpenSignInInterface.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenSignInInterfaceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpenSignInInterfaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOpenSignInInterfaceMouseExited(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/usernameLogo.png"))); // NOI18N
        lblUsername.setText("Username:");
        lblUsername.setAutoscrolls(true);

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/emailLogo.png"))); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setAutoscrolls(true);

        txtEmail.setBackground(new java.awt.Color(0, 32, 82));
        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.setOpaque(false);

        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblSignUpMessage.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblSignUpMessage.setForeground(new java.awt.Color(204, 0, 0));
        lblSignUpMessage.setText(" ");

        lblLastName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/nameLogo.png"))); // NOI18N
        lblLastName.setText("Last Name:");
        lblLastName.setAutoscrolls(true);

        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblFirstName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/nameLogo.png"))); // NOI18N
        lblFirstName.setText("First Name:");
        lblFirstName.setAutoscrolls(true);

        txtLastName.setBackground(new java.awt.Color(0, 32, 82));
        txtLastName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtLastName.setBorder(null);
        txtLastName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtLastName.setOpaque(false);

        lblHaveAccount.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblHaveAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblHaveAccount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHaveAccount.setText("Already have an account?");

        txtFirstName.setBackground(new java.awt.Color(0, 32, 82));
        txtFirstName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(255, 255, 255));
        txtFirstName.setBorder(null);
        txtFirstName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFirstName.setOpaque(false);

        passPassword.setBackground(new java.awt.Color(0, 32, 82));
        passPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        passPassword.setForeground(new java.awt.Color(255, 255, 255));
        passPassword.setBorder(null);
        passPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        passPassword.setOpaque(false);

        jSeparator11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator11.setMinimumSize(new java.awt.Dimension(0, 400));

        jSeparator12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignUp_last.png"))); // NOI18N
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        lblProductId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblProductId.setForeground(new java.awt.Color(255, 255, 255));
        lblProductId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/productIdSignUpLogo.png"))); // NOI18N
        lblProductId.setText("Product ID:");
        lblProductId.setAutoscrolls(true);

        jSeparator13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtProductId.setBackground(new java.awt.Color(0, 32, 82));
        txtProductId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtProductId.setForeground(new java.awt.Color(255, 255, 255));
        txtProductId.setBorder(null);
        txtProductId.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProductId.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProductId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passPassword))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(lblHaveAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOpenSignInInterface))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSignUp)
                                .addGap(106, 106, 106))
                            .addComponent(jSeparator12)
                            .addComponent(jSeparator8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName))
                            .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator10)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblProductId)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblSignUpMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFirstName))
                .addGap(5, 5, 5)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLastName))
                .addGap(5, 5, 5)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(5, 5, 5)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductId))
                .addGap(5, 5, 5)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblSignUpMessage)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHaveAccount)
                    .addComponent(btnOpenSignInInterface))
                .addGap(15, 15, 15))
        );

        lblLogoName.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        lblLogoName.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoName.setText("INTERFACE");

        lblLogoName1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        lblLogoName1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoName1.setText("COOLER");

        btnExitSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnExitSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExitSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exitLogo.png"))); // NOI18N
        btnExitSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitSignUpMouseClicked(evt);
            }
        });

        dragLineSignUp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragLineSignUpMouseDragged(evt);
            }
        });
        dragLineSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragLineSignUpMousePressed(evt);
            }
        });

        btnMinimizeSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/minimizeLogo.png"))); // NOI18N
        btnMinimizeSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizeSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLogoCooler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLogoName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLogoName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dragLineSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMinimizeSignUp)))
                .addGap(8, 8, 8)
                .addComponent(btnExitSignUp)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMinimizeSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnExitSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(dragLineSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblLogoCooler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogoName1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblLogoName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnExitSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitSignUpMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitSignUpMouseClicked
    
    private void dragLineSignUpMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLineSignUpMouseDragged
        int coordinateX = evt.getXOnScreen();
        int coordinateY = evt.getYOnScreen();
        
        this.setLocation(coordinateX - mousePositionX, coordinateY - mousePositionY);
    }//GEN-LAST:event_dragLineSignUpMouseDragged
    
    private void dragLineSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLineSignUpMousePressed
        mousePositionX = evt.getX();
        mousePositionY = evt.getY();
    }//GEN-LAST:event_dragLineSignUpMousePressed
    
    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        try {
            limitTo();
            addActuator();
            addCentralProcessorUnit();
            addTemperatureSensor();
            addCooler();
            addInternetUser();
            
            FrmNetworkInterface networkInterface = new FrmNetworkInterface();
            networkInterface.setVisible(true);
            dispose();
        } catch (NameLengthException exception) {
            lblSignUpMessage.setForeground(new Color(204, 0, 0));
            lblSignUpMessage.setText(exception.getMessage());
        } catch (EmailConstraintException exception) {
            lblSignUpMessage.setForeground(new Color(204, 0, 0));
            lblSignUpMessage.setText(exception.getMessage());
        }  catch (UniqueEntityException exception) {
            lblSignUpMessage.setForeground(new Color(204, 0, 0));
            lblSignUpMessage.setText("*" + exception.getMessage());
        }catch (SQLException ex) {
            Logger.getLogger(FrmSignUpInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignUpMouseClicked
    
    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignUp_first.png")));
    }//GEN-LAST:event_btnSignUpMouseEntered
    
    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/buttonSignUp_last.png")));
    }//GEN-LAST:event_btnSignUpMouseExited
    
    private void btnOpenSignInInterfaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignInInterfaceMouseEntered
        btnOpenSignInInterface.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnOpenSignInInterfaceMouseEntered
    
    private void btnOpenSignInInterfaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignInInterfaceMouseExited
        btnOpenSignInInterface.setForeground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnOpenSignInInterfaceMouseExited
    
    private void btnOpenSignInInterfaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSignInInterfaceMouseClicked
        FrmSignInInterface signInInterface = new FrmSignInInterface();
        signInInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOpenSignInInterfaceMouseClicked
    
    private void btnMinimizeSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeSignUpMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeSignUpMouseClicked
    
    private void limitTo() throws NameLengthException, EmailConstraintException{
        signUpValidator = FirstNameSignUpValidator.createAsSingleton();
        signUpValidator.limitTo(txtFirstName.getText());
        signUpValidator = LastNameSignUpValidator.createAsSingleton();
        signUpValidator.limitTo(txtLastName.getText());
        signUpValidator = UsernameSignUpValidator.createAsSingleton();
        signUpValidator.limitTo(txtUsername.getText());
        signUpValidator = EmailSignUpValidator.createAsSingleton();
        signUpValidator.limitTo(txtEmail.getText());
        emailValidator = EmailSignUpValidator.createAsSingleton();
        emailValidator.validate(txtEmail.getText());
        signUpValidator = PasswordSignUpValidator.createAsSingleton();
        signUpValidator.limitTo(passPassword.getText());
        signUpValidator = CoolerProductIdValidator.createAsSingleton();
        signUpValidator.limitTo(txtProductId.getText());
        
    }
    
    private void addActuator() throws UniqueEntityException{
        actuatorManager = ActuatorManager.createAsSingleton();
        int actuatorId = actuatorManager.generateRandomPartNumber();
        actuator = new Actuator(WIDTH,actuatorId,"No");
        actuatorManager.add(actuator);
    }
    
    private void addCentralProcessorUnit() throws UniqueEntityException{
        centralProcessorUnitManager = CentralProcessorUnitManager.createAsSingleton();
        int centralProcessorUnitProductId = centralProcessorUnitManager.generateRandomPartNumber();
        centralProcessorUnit = new CentralProcessorUnit(WIDTH,centralProcessorUnitProductId,"No");
        centralProcessorUnitManager.add(centralProcessorUnit);
    }
    
    private void addTemperatureSensor() throws UniqueEntityException{
        temperatureSensorManager = TemperatureSensorManager.createAsSingleton();
        int temperatureSensorProductId = temperatureSensorManager.generateRandomPartNumber();
        temperatureSensor = new TemperatureSensor(WIDTH, temperatureSensorProductId, 0, "No");
        temperatureSensorManager.add(temperatureSensor);
    }
    
    private void addCooler() throws UniqueEntityException, SQLException{
        coolerManager = CoolerManager.createAsSingleton();
        cooler = new Cooler(WIDTH, txtProductId.getText(), centralProcessorUnit.getId(), actuator.getId(), temperatureSensor.getId(), "Closed");
        coolerManager.add(cooler, centralProcessorUnit, actuator, temperatureSensor);
    }
    
    private void addInternetUser() throws UniqueEntityException, SQLException{
        internetUserManager = InternetUserManager.createAsSingleton();
        passwordManager = PasswordManager.createAsSingleton();
        String hashedPassword = passwordManager.generatePasswordHash(passPassword.getText());
        internetUser = new InternetUser(WIDTH,coolerManager.queryCoolerId(txtProductId.getText()),txtFirstName.getText(), txtLastName.getText(),
                txtUsername.getText(), txtEmail.getText(), hashedPassword, "Yes");
        internetUserManager.add(internetUser);
    }
    
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
            java.util.logging.Logger.getLogger(FrmSignUpInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSignUpInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSignUpInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSignUpInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSignUpInterface().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExitSignUp;
    private javax.swing.JLabel btnMinimizeSignUp;
    private javax.swing.JLabel btnOpenSignInInterface;
    private javax.swing.JLabel btnSignUp;
    private javax.swing.JLabel dragLineSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHaveAccount;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogoCooler;
    private javax.swing.JLabel lblLogoName;
    private javax.swing.JLabel lblLogoName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblSignUpMessage;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField passPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
