package view.dashboardPanels;
import Controllers.ParkingController;
import Models.Parking;
import javax.swing.JOptionPane;



public class ParkingInputDialog extends javax.swing.JDialog {
    
    private javax.swing.JPanel targetSlot;
    public String dumm_slotname, slot;

    public void setTargetSlot(javax.swing.JPanel slot) {
    this.targetSlot = slot;
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ParkingInputDialog.class.getName());

    
    public ParkingInputDialog(java.awt.Frame parent, boolean modal, String slotname) {
        super(parent, modal);
        initComponents();
        main_label.setText("INPUT PARKING INFORMATION ON "+slotname);
        
        this.dumm_slotname = slotname.substring(0,1);
        this.slot = slotname;
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main_label = new javax.swing.JLabel();
        plateNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vehicleType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        main_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        main_label.setForeground(new java.awt.Color(15, 23, 42));
        main_label.setText("INPUT PARKING INFORMATION");

        plateNum.setPreferredSize(new java.awt.Dimension(64, 30));
        plateNum.addActionListener(this::plateNumActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Plate Number :");

        vehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "SUV", "Motorcycle", "Electric Vehicle", "Truck", "Others" }));
        vehicleType.setPreferredSize(new java.awt.Dimension(113, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Vehicle Type :");

        submitBtn.setBackground(new java.awt.Color(255, 102, 0));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setFocusPainted(false);
        submitBtn.addActionListener(this::submitBtnActionPerformed);

        cancelBtn.setBackground(new java.awt.Color(102, 102, 102));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(this::cancelBtnActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plateNum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(main_label)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(main_label)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plateNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void plateNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateNumActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (targetSlot != null) {
            // Turn slot red


            ParkingLayoutPanel pl = new ParkingLayoutPanel();

            //Submit information to DB
            
            ParkingController pc = new ParkingController();
            Parking park = new Parking();
            
            //Parking register
            if(! plateNum.getText().equals("")){
                int price=0;
                if(dumm_slotname.equals("A") || dumm_slotname.equals("B") || dumm_slotname.equals("C")){
                    price = 60;
                }else if(dumm_slotname.equals("D") || dumm_slotname.equals("E")){
                    price = 40;
                }else if(dumm_slotname.equals("P")){
                    price = 35;
                }

                park.setPlate(plateNum.getText());           
                park.setVehicle(vehicleType.getSelectedItem().toString()); 
                park.setPrice(price);
                park.setSlot(slot);
                
                pc.register(park);
                
                targetSlot.setBackground(new java.awt.Color(210, 43, 43)); 
                targetSlot.revalidate();
                targetSlot.repaint();
                
                JOptionPane.showMessageDialog(this, "Parking registration Successful");
                
            
            }else{
                JOptionPane.showMessageDialog(this, "Invalid plate numeber!", "Register Error!", JOptionPane.ERROR_MESSAGE);
            }


            // Close
            this.dispose();
       
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ParkingInputDialog dialog = new ParkingInputDialog(new javax.swing.JFrame(), true, "dummy");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_label;
    private javax.swing.JTextField plateNum;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> vehicleType;
    // End of variables declaration//GEN-END:variables
}
