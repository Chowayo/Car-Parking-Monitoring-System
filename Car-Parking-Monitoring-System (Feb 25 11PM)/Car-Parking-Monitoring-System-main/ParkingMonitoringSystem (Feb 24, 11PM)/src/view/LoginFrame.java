package view;
import Controllers.UserController;
import Models.Users;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginFrame.class.getName());

    public static String firstname, lastname, email, password;
    public static int id;
    public LoginFrame() {
        initComponents();
        
    javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource("/view/Images/usernameIcon.png"));

    if (originalIcon != null) {
        // 2. Scale it to be TINY (20x20) to fit in the text bar
        java.awt.Image image = originalIcon.getImage();
        
        // CHANGE THIS: 20, 20 (Not 242, 364!)
        java.awt.Image newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);

        // 3. Put it on the NEW label
        lblUserIcon.setIcon(new javax.swing.ImageIcon(newimg));
    }
    javax.swing.ImageIcon lockOriginal = new javax.swing.ImageIcon(getClass().getResource("/view/Images/lockIcon.png"));

if (lockOriginal != null) {
    // 2. Scale it to be TINY (20x20) just like the user icon
    java.awt.Image lockImg = lockOriginal.getImage();
    java.awt.Image lockScaled = lockImg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

    // 3. Set it on the new label
    lblPassIcon.setIcon(new javax.swing.ImageIcon(lockScaled));
}

    }
    
    public LoginFrame(String first_name, String last_name , String email, String password, int id) {
        this();
        this.firstname = first_name;
        this.lastname = last_name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginEmployeeID = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        signInBtn = new javax.swing.JButton();
        rememberMe = new javax.swing.JCheckBox();
        forgotPassBtn = new javax.swing.JLabel();
        registerBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUserIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPassIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        loginEmployeeID.setForeground(new java.awt.Color(153, 153, 153));
        loginEmployeeID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginEmployeeID.setMargin(new java.awt.Insets(2, 110, 2, 6));
        loginEmployeeID.setRequestFocusEnabled(false);

        loginPassword.setForeground(new java.awt.Color(153, 153, 153));
        loginPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginPassword.setMargin(new java.awt.Insets(2, 100, 2, 6));

        signInBtn.setText("Sign In");
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addActionListener(this::signInBtnActionPerformed);

        rememberMe.setForeground(new java.awt.Color(255, 255, 255));
        rememberMe.setText("Remember me");

        forgotPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassBtn.setText("<html><u>Forgot password?</u></html>");
        forgotPassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassBtnMouseClicked(evt);
            }
        });

        registerBtn.setText("<html><font color='blue'> <u>Register</u></font></html>");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Don't have an account?");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        lblUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/usernameIcon.png"))); // NOI18N
        jPanel2.add(lblUserIcon, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        lblPassIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/lockIcon.png"))); // NOI18N
        jPanel4.add(lblPassIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginEmployeeID)
                            .addComponent(loginPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rememberMe)
                                .addGap(91, 91, 91)
                                .addComponent(forgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(signInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberMe)
                    .addComponent(forgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(signInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassBtnMouseClicked
        ResetPassFrame resetFrame = new ResetPassFrame();
        resetFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_forgotPassBtnMouseClicked

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        // open the register window
        RegisterFrame regFrame = new RegisterFrame();
        regFrame.setVisible(true);

        // close login window
        this.dispose();
    }//GEN-LAST:event_registerBtnMouseClicked

    
    

    //SPACER
    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
       
        String id = loginEmployeeID.getText();
        int int_id = Integer.parseInt(id);
        //String passw = loginPassword.getText();
        UserController usercon = new UserController(); //Creating objects
        
        //Encryption
        String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
        String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
        String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
        String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};

        String password_convert = usercon.convert(loginPassword.getText(), encrypt_1, small); //Encryptor 1
        password_convert = usercon.convert(password_convert, encrypt_2, encrypt_1); //Encryptor 2
        password_convert = usercon.convert(password_convert, encrypt_3, encrypt_2); //Encryptor 3
        
        if(! loginEmployeeID.getText().equals("") && ! loginPassword.getText().equals("")){
            
            if(usercon.authenticate(id, password_convert) != null){ 
                
                List<Users> session = usercon.session(int_id, password_convert);
                for(Users user: session){
                    int EmployeeID = user.getEmployeeID();
                    String first_name = user.getFname();
                    String last_name = user.getLname();
                    String email = user.getEmail();
                    String password = user.getPassword();

                    LoginFrame get_sessions = new LoginFrame(first_name, last_name, email, password, int_id);
                }
                
            
            JOptionPane.showMessageDialog(this, "Welcome Admin"); 
            
            // Proceed to Dashboard...
            DashboardFrame df = new DashboardFrame(); 
            df.setVisible(true); 
            this.dispose(); 
        
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE); //Acts as a sweet alert for error
            }
            
            //MICHAEL NOTE: Hindi pa sure kung nagana to
            Preferences prefs = Preferences.userNodeForPackage(LoginFrame.class);
            if (rememberMe.isSelected()) {
                // Save the username and password
                prefs.put("savedUsername", loginEmployeeID.getText());
                prefs.put("savedPassword", new String(loginPassword.getPassword())); 
                prefs.putBoolean("rememberMe", true);
            } else {
                // If unchecked, remove the saved data
                prefs.remove("savedUsername");
                prefs.remove("savedPassword");
                prefs.remove("rememberMe");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Textbox empty!", "Error", JOptionPane.ERROR_MESSAGE); //Acts as a sweet alert for error
        }               
    }//GEN-LAST:event_signInBtnActionPerformed

    
    
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPassIcon;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JTextField loginEmployeeID;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JLabel registerBtn;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JButton signInBtn;
    // End of variables declaration//GEN-END:variables
}
