package view;

import Models.Users; 
import Controllers.UserController; 
import javax.swing.JOptionPane;


public class RegisterFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegisterFrame.class.getName());


    public RegisterFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        Repass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        sign_in = new javax.swing.JButton();
        signInBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 22, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 165, 177));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(157, 165, 177));
        jLabel3.setText("Last Name");

        lname.setForeground(new java.awt.Color(14, 22, 40));
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 165, 177)));

        fname.setForeground(new java.awt.Color(14, 22, 40));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 165, 177)));
        fname.addActionListener(this::fnameActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(157, 165, 177));
        jLabel4.setText("Employee Email");

        email.setForeground(new java.awt.Color(14, 22, 40));
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 165, 177)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(157, 165, 177));
        jLabel7.setText("Password");

        pass.setForeground(new java.awt.Color(14, 22, 40));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 165, 177)));

        Repass.setForeground(new java.awt.Color(14, 22, 40));
        Repass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 165, 177)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(157, 165, 177));
        jLabel8.setText("Re-enter password");

        sign_in.setBackground(new java.awt.Color(255, 81, 0));
        sign_in.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sign_in.setForeground(new java.awt.Color(255, 255, 255));
        sign_in.setText("Sign up");
        sign_in.setBorderPainted(false);
        sign_in.setFocusPainted(false);
        sign_in.addActionListener(this::sign_inActionPerformed);

        signInBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signInBtn.setForeground(new java.awt.Color(255, 81, 0));
        signInBtn.setText("<html> <u>Sign In</u></html>");
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInBtnMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(157, 165, 177));
        jLabel5.setText("Already have an account?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sign_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Repass)
                                .addComponent(jLabel8)
                                .addComponent(pass)
                                .addComponent(jLabel7)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Repass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(signInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        
    }//GEN-LAST:event_fnameActionPerformed

    private void signInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseClicked
        // TODO add your handling code here:
        // open the sign in window
        LoginFrame logFrame = new LoginFrame();
        logFrame.setVisible(true);

        // close register window
        this.dispose();
    }//GEN-LAST:event_signInBtnMouseClicked
   
    private void sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_inActionPerformed
        Users user = new Users(); 
        UserController usercon = new UserController();
 
        if(! pass.getText().equals("") &&! Repass.getText().equals("") && ! fname.getText().equals("") && ! lname.getText().equals("") && ! email.getText().equals("")){
            if(pass.getText().equals(Repass.getText())){
                if(pass.getText().length() >= 8){         
                    user.setFname(fname.getText()); 
                    user.setLname(lname.getText());
                    user.setEmail(email.getText());
                    String password_convert = pass.getText();

                    //Encryption
                    String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
                    String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
                    String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
                    String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};

                    password_convert = usercon.convert(password_convert, encrypt_1, small); //Encryptor 1
                    password_convert = usercon.convert(password_convert, encrypt_2, encrypt_1); //Encryptor 2
                    password_convert = usercon.convert(password_convert, encrypt_3, encrypt_2); //Encryptor 3
                    user.setPassword(password_convert);

                    usercon.register(user);
                    JOptionPane.showMessageDialog(this, "Employee Registered!","Registration Success", JOptionPane.INFORMATION_MESSAGE);

                    LoginFrame lf = new LoginFrame(); 
                    lf.setVisible(true); 
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Password must be atleast 8 characters long!", "Register Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Password must be matched!", "Register Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Incomplete Employee Information!", "Register Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sign_inActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new RegisterFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Repass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel signInBtn;
    private javax.swing.JButton sign_in;
    // End of variables declaration//GEN-END:variables
}
