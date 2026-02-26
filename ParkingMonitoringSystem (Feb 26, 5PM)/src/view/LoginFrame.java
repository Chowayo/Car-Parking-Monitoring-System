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
        
    loginPassword.setText("Password");
    loginPassword.setEchoChar((char) 0); // (char)0 means "Normal Text"
    loginPassword.setForeground(new java.awt.Color(153, 153, 153));
        
        
    javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource("/view/Images/usernameIcon.png"));

    if (originalIcon != null) {
        java.awt.Image image = originalIcon.getImage();
        java.awt.Image newimg = image.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);

        // Put it on the NEW label
        lblUserIcon.setIcon(new javax.swing.ImageIcon(newimg));
    }
    javax.swing.ImageIcon lockOriginal = new javax.swing.ImageIcon(getClass().getResource("/view/Images/lockIcon.png"));

    if (lockOriginal != null) {
        java.awt.Image lockImg = lockOriginal.getImage();
        java.awt.Image lockScaled = lockImg.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);

        //new label
        lblPassIcon.setIcon(new javax.swing.ImageIcon(lockScaled));
    }

    Preferences prefs = Preferences.userNodeForPackage(LoginFrame.class);

            // Check if "Remember Me" was checked last time
            if (prefs.getBoolean("rememberMe", false)) {

                //Get the saved text
                String savedID = prefs.get("savedUsername", "");
                String savedPass = prefs.get("savedPassword", "");

                // Put it in the boxes
                loginEmployeeID.setText(savedID);
                loginPassword.setText(savedPass);
                rememberMe.setSelected(true);

                loginEmployeeID.setForeground(new java.awt.Color(0, 0, 0)); // Black Text
                loginPassword.setForeground(new java.awt.Color(0, 0, 0));   // Black Text
                loginPassword.setEchoChar('*'); //security dots
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

        jPanel1.setBackground(new java.awt.Color(14, 22, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        loginEmployeeID.setForeground(new java.awt.Color(14, 22, 40));
        loginEmployeeID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginEmployeeID.setMargin(new java.awt.Insets(2, 110, 2, 6));
        loginEmployeeID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginEmployeeIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginEmployeeIDFocusLost(evt);
            }
        });

        loginPassword.setForeground(new java.awt.Color(14, 22, 40));
        loginPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginPassword.setMargin(new java.awt.Insets(2, 100, 2, 6));
        loginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginPasswordFocusLost(evt);
            }
        });

        signInBtn.setBackground(new java.awt.Color(255, 81, 0));
        signInBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signInBtn.setForeground(new java.awt.Color(255, 255, 255));
        signInBtn.setText("Sign In");
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addActionListener(this::signInBtnActionPerformed);

        rememberMe.setBackground(new java.awt.Color(14, 22, 40));
        rememberMe.setForeground(new java.awt.Color(157, 165, 177));
        rememberMe.setText("Remember me");
        rememberMe.addActionListener(this::rememberMeActionPerformed);

        forgotPassBtn.setForeground(new java.awt.Color(157, 165, 177));
        forgotPassBtn.setText("<html><u>Forgot password?</u></html>");
        forgotPassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassBtnMouseClicked(evt);
            }
        });

        registerBtn.setForeground(new java.awt.Color(255, 81, 0));
        registerBtn.setText("<html> <u>Register</u></html>");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(157, 165, 177));
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
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginEmployeeID)
                            .addComponent(loginPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rememberMe)
                                .addGap(91, 91, 91)
                                .addComponent(forgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(signInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1)))
                .addContainerGap(120, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        String passw = loginPassword.getText();
        UserController usercon = new UserController(); //Creating objects
        
        //Encryption
        String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
        String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
        String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
        String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};

        String password_convert = usercon.convert(loginPassword.getText(), encrypt_1, small); //Encryptor 1
        password_convert = usercon.convert(password_convert, encrypt_2, encrypt_1); //Encryptor 2
        password_convert = usercon.convert(password_convert, encrypt_3, encrypt_2); //Encryptor 3
        
        if(!id.equals("") && !passw.equals("") && !id.equals("Employee ID") && !passw.equals("Password")){
            
            try {
                int int_id = Integer.parseInt(id); // Convert ID to integer safely

                if(usercon.authenticate(id, password_convert) != null){ 
                    
                    // Session Logic
                    List<Users> session = usercon.session(int_id, password_convert);
                    for(Users user: session){
                        this.firstname = user.getFname();
                        this.lastname = user.getLname();
                        this.email = user.getEmail();
                        this.password = user.getPassword();
                        this.id = user.getEmployeeID();
                    }
                    
                    JOptionPane.showMessageDialog(this, "Welcome Admin"); 
                    
                    //MICHAEL NOTE: Hindi pa sure kung nagana to CHOW: NAGANA NA
                    Preferences prefs = Preferences.userNodeForPackage(LoginFrame.class);
                    if (rememberMe.isSelected()) {
                        // Save the username and password
                        prefs.put("savedUsername", id);
                        prefs.put("savedPassword", passw); 
                        prefs.putBoolean("rememberMe", true);
                    } else {
                        // If unchecked, remove the saved data
                        prefs.remove("savedUsername");
                        prefs.remove("savedPassword");
                        prefs.remove("rememberMe");
                    }

                    // Proceed to Dashboard
                    DashboardFrameMain df = new DashboardFrameMain(); 
                    df.setVisible(true); 
                    this.dispose(); 
                
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE); //Acts as a sweet alert for error
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Employee ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Textbox empty!", "Error", JOptionPane.ERROR_MESSAGE); //Acts as a sweet alert for error
        }
        
           
    }//GEN-LAST:event_signInBtnActionPerformed

    private void loginEmployeeIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginEmployeeIDFocusGained
        // TODO add your handling code here:
        
        if (loginEmployeeID.getText().equals("Employee ID")) {
        loginEmployeeID.setText("");
        loginEmployeeID.setForeground(new java.awt.Color(0, 0, 0)); // Set text color to Black for typing
        }
        
    }//GEN-LAST:event_loginEmployeeIDFocusGained

    private void loginEmployeeIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginEmployeeIDFocusLost
        // TODO add your handling code here:
        if (loginEmployeeID.getText().isEmpty()) {
            loginEmployeeID.setText("Employee ID");
            loginEmployeeID.setForeground(new java.awt.Color(153, 153, 153));
            }
    }//GEN-LAST:event_loginEmployeeIDFocusLost

    
    private void loginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusGained
        // TODO add your handling code here:
        String pass = new String(loginPassword.getPassword());
    
        if (pass.equals("Password")) {
            loginPassword.setText("");
            loginPassword.setForeground(new java.awt.Color(0, 0, 0));
            loginPassword.setEchoChar('*'); //dots security
        }
    }//GEN-LAST:event_loginPasswordFocusGained

    private void loginPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusLost
        // TODO add your handling code here:
        String pass = new String(loginPassword.getPassword());
    
        if (pass.isEmpty()) {
            loginPassword.setText("Password");
            loginPassword.setForeground(new java.awt.Color(153, 153, 153));
            loginPassword.setEchoChar((char) 0); // Turn OFF dots security so user can read Password
        }
    }//GEN-LAST:event_loginPasswordFocusLost

    private void rememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeActionPerformed
        // TODO add your handling code here:
            // Check the box UNCHECKED
        if (!rememberMe.isSelected()) {

            // Delete the saved file immediately
            Preferences prefs = Preferences.userNodeForPackage(LoginFrame.class);
            prefs.remove("savedUsername");
            prefs.remove("savedPassword");
            prefs.remove("rememberMe");

            // Clear the text boxes on the screen
            loginEmployeeID.setText("Employee ID");
            loginEmployeeID.setForeground(new java.awt.Color(153, 153, 153));

            loginPassword.setText("Password");
            loginPassword.setEchoChar((char) 0); // Show text
            loginPassword.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_rememberMeActionPerformed

    
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
