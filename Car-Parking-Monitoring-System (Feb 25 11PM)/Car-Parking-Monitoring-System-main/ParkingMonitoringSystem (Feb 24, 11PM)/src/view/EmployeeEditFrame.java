
package view;

import Controllers.UserController;
import Models.Users;
import javax.swing.JOptionPane;

public class EmployeeEditFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmployeeEditFrame.class.getName());

    public EmployeeEditFrame() {
        initComponents();
        update_fname.setText(LoginFrame.firstname);
        update_lname.setText(LoginFrame.lastname);
        update_email.setText(LoginFrame.email);
        
        UserController usercon = new UserController();
        
        String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
        String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
        String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
        String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};
        
        String password_revert = usercon.convert(LoginFrame.password, encrypt_2, encrypt_3); //Decryption 1
        password_revert = usercon.convert(password_revert, encrypt_1, encrypt_2); //Decryption 1
        password_revert = usercon.convert(password_revert, small, encrypt_1); //Decryption 1

        
        update_password.setText(password_revert);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update_fname = new javax.swing.JTextField();
        update_lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        update_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("NOTE: THIS IS FOR TESTING ONLY (THIS IS TO TEST DECRYPTOR AND UPDATE DON'T DELETE)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("First name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Password:");

        btn_update.setText("Update Employee");
        btn_update.addActionListener(this::btn_updateActionPerformed);

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(this::btn_cancelActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_email, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_password, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Users user = new Users(); 
        UserController usercon = new UserController();
        
        if(!update_fname.getText().equals("")&&!update_lname.getText().equals("")&&!update_email.getText().equals("")&&!update_password.getText().equals("")){
            if(update_password.getText().length()>=8){
                
                user.setFname(update_fname.getText()); 
                user.setLname(update_lname.getText());
                user.setEmail(update_email.getText());
                
                
                String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
                String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
                String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
                String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};
                
                String password_convert = usercon.convert(update_password.getText(), encrypt_1, small); //Encryptor 1
                password_convert = usercon.convert(password_convert, encrypt_2, encrypt_1); //Encryptor 2
                password_convert = usercon.convert(password_convert, encrypt_3, encrypt_2); //Encryptor 3

                user.setPassword(password_convert);
                usercon.update(user, LoginFrame.id);
                
                JOptionPane.showMessageDialog(this, "Update Successfull");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Password must be atleast 8 characters long!", "Register Error!", JOptionPane.ERROR_MESSAGE);
            }
        
        }else{
            JOptionPane.showMessageDialog(this, "Incomplete Employee Information!", "Register Error!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
       // open the register window
        EmployeeInfoFrame EmpInfFrame = new EmployeeInfoFrame();
        EmpInfFrame.setVisible(true);

        // close login window
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new EmployeeEditFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField update_email;
    private javax.swing.JTextField update_fname;
    private javax.swing.JTextField update_lname;
    private javax.swing.JTextField update_password;
    // End of variables declaration//GEN-END:variables
}
