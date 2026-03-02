
package view;
import Controllers.UserController;
import Models.Users;

public class EmployeeInfoFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmployeeInfoFrame.class.getName());

    public EmployeeInfoFrame() {
        initComponents();
        employeeId_label.setText("First Name: "+LoginFrame.employeeID);
        fname_label.setText("First Name: "+LoginFrame.firstname);
        lname_label.setText("Last Name: "+LoginFrame.lastname);
        email_label.setText("Email: "+LoginFrame.email);
         
        UserController usercon = new UserController();
        
        String[] small     = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"}; 
        String[] encrypt_1 = {"b","s","a","y","w","x","7","f","n","C","r","B","3","F","D","L","Y","O","c","E","J","d","q","g","t","l","K","e","T","H","M","m","2","S","5","p","1","R","0","A","X","k","V","i","P","h","G","W","4","8","9","6","j","o","U","I","v","Q","z","Z","N","u"};       
        String[] encrypt_2 = {"i","Q","2","m","B","h","t","E","S","x","L","n","0","J","d","7","I","K","v","R","a","N","8","f","k","P","V","3","w","y","c","4","g","M","O","G","o","1","p","z","u","Y","s","b","W","U","T","l","5","H","F","e","A","D","q","j","9","Z","C","X","6","r"};    
        String[] encrypt_3 = {"G","p","8","V","k","y","z","P","2","S","r","f","c","I","0","L","d","X","n","M","w","t","v","O","J","q","A","B","1","u","6","E","4","h","Z","m","H","i","R","g","K","l","Q","N","a","o","x","7","W","U","Y","s","j","3","C","T","e","5","D","F","9","b"};
        
        String password_revert = usercon.convert(LoginFrame.password, encrypt_2, encrypt_3); //Decryption 1
        password_revert = usercon.convert(password_revert, encrypt_1, encrypt_2); //Decryption 1
        password_revert = usercon.convert(password_revert, small, encrypt_1); //Decryption 1
        
        password_label.setText("Password: "+password_revert);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        employeeId_label = new javax.swing.JLabel();
        fname_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        update_btn = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        employeeId_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        employeeId_label.setText("rrrrrrr");

        fname_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fname_label.setText("rrrrrrr");

        lname_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lname_label.setText("rrrrrrr");

        email_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        email_label.setText("rrrrrrr");

        password_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        password_label.setText("rrrrrrr");

        update_btn.setText("Update employee info");
        update_btn.addActionListener(this::update_btnActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeId_label)
                            .addComponent(fname_label)
                            .addComponent(lname_label)
                            .addComponent(email_label)
                            .addComponent(password_label)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(employeeId_label)
                .addGap(18, 18, 18)
                .addComponent(fname_label)
                .addGap(18, 18, 18)
                .addComponent(lname_label)
                .addGap(18, 18, 18)
                .addComponent(email_label)
                .addGap(18, 18, 18)
                .addComponent(password_label)
                .addGap(65, 65, 65)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label1.setText("Welcome employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(label1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
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

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // open the register window
        EmployeeEditFrame EmpEditFrame = new EmployeeEditFrame();
        EmpEditFrame.setVisible(true);

        // close login window
        this.dispose();
    }//GEN-LAST:event_update_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new EmployeeInfoFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel employeeId_label;
    private javax.swing.JLabel fname_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
