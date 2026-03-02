
package view;

import view.dashboardPanels.HomePanel;
import view.dashboardPanels.ParkingLayoutPanel;
import view.dashboardPanels.ParkingTablePanel;
import view.dashboardPanels.AccountSettingsPanel;


public class DashboardFrameMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DashboardFrameMain.class.getName());


    public DashboardFrameMain() {
        initComponents();
        java.awt.event.ItemListener menuListener = new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                javax.swing.JToggleButton btn = (javax.swing.JToggleButton) evt.getSource();
                if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    // ACTIVE
                    btn.setContentAreaFilled(true); 
                    btn.setOpaque(true);
                    btn.setBackground(new java.awt.Color(255, 81, 0)); // Vibrant Orange
                    btn.setForeground(java.awt.Color.WHITE);
                    btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
                } else {
                    //NACTIVE
                    btn.setContentAreaFilled(false);
                    btn.setOpaque(false);
                    btn.setForeground(new java.awt.Color(157, 165, 177)); // Muted Gray
                    btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
                    btn.setBackground(new java.awt.Color(14, 22, 40)); 
                }
            }
        };

        javax.swing.JToggleButton[] menuButtons = {homeBtn, parkingBtn, parkingTableBtn, accountSettingsBtn};
        
        for (javax.swing.JToggleButton btn : menuButtons) {
            btn.addItemListener(menuListener);
            btn.setFocusPainted(false);
            btn.setBorderPainted(false);
            btn.setRolloverEnabled(false);
            
            btn.setUI(new javax.swing.plaf.basic.BasicToggleButtonUI()); 
        }
        
        homeBtn.setUI(new javax.swing.plaf.basic.BasicToggleButtonUI());
        homeBtn.setOpaque(true);
        homeBtn.setContentAreaFilled(true);
        homeBtn.setBackground(new java.awt.Color(255, 81, 0));
        homeBtn.setForeground(java.awt.Color.WHITE);
        homeBtn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        
        setButtonIcon(homeBtn, "/view/Images/homeIcon.png");
        setButtonIcon(parkingBtn, "/view/Images/carIcon.png");
        setButtonIcon(parkingTableBtn, "/view/Images/tableIcon.png");
        setButtonIcon(accountSettingsBtn, "/view/Images/settingsIcon.png");
        setButtonIcon(logoutBtn, "/view/Images/logoutIcon.png");
}
    private void setButtonIcon(javax.swing.JToggleButton btn, String path) {
    try {
        java.net.URL imgURL = getClass().getResource(path);
        
        if (imgURL != null) {
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
            java.awt.Image img = icon.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            btn.setIcon(new javax.swing.ImageIcon(img));
        } else {
            System.err.println("CANNOT FIND ICON AT: " + path);
        }
    } catch (Exception e) {
        System.err.println("Icon Error: " + e.getMessage());
    }
    
    java.awt.CardLayout cardLayout = (java.awt.CardLayout) mainPanel.getLayout();

    // Create instances of your page panels
    HomePanel homePnl = new HomePanel();
    ParkingLayoutPanel parkingPnl = new ParkingLayoutPanel();
    ParkingTablePanel parkingTablePnl = new ParkingTablePanel();
    AccountSettingsPanel accountSettingsPnl = new AccountSettingsPanel();

    mainPanel.add(homePnl, "home");
    mainPanel.add(parkingPnl, "parking layout");
    mainPanel.add(parkingTablePnl, "parking table");
    mainPanel.add(accountSettingsPnl, "account settings");
    
    // Forces the window to open fully maximized
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

    // Center the window perfectly on the user's screen
    this.setLocationRelativeTo(null);
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanelButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JToggleButton();
        parkingBtn = new javax.swing.JToggleButton();
        accountSettingsBtn = new javax.swing.JToggleButton();
        parkingTableBtn = new javax.swing.JToggleButton();
        logoutBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        sidePanel.setBackground(new java.awt.Color(14, 22, 40));
        sidePanel.setMaximumSize(new java.awt.Dimension(280, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(LOGO) NEXUS");

        homeBtn.setBackground(new java.awt.Color(14, 22, 40));
        sidePanelButtonGroup.add(homeBtn);
        homeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(157, 165, 177));
        homeBtn.setSelected(true);
        homeBtn.setText("Home");
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeBtn.setIconTextGap(15);
        homeBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        homeBtn.addActionListener(this::homeBtnActionPerformed);

        parkingBtn.setBackground(new java.awt.Color(14, 22, 40));
        sidePanelButtonGroup.add(parkingBtn);
        parkingBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        parkingBtn.setForeground(new java.awt.Color(157, 165, 177));
        parkingBtn.setText("Parking Layout");
        parkingBtn.setBorderPainted(false);
        parkingBtn.setContentAreaFilled(false);
        parkingBtn.setFocusPainted(false);
        parkingBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        parkingBtn.setIconTextGap(15);
        parkingBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        parkingBtn.addActionListener(this::parkingBtnActionPerformed);

        accountSettingsBtn.setBackground(new java.awt.Color(14, 22, 40));
        sidePanelButtonGroup.add(accountSettingsBtn);
        accountSettingsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accountSettingsBtn.setForeground(new java.awt.Color(157, 165, 177));
        accountSettingsBtn.setText("Account Settings");
        accountSettingsBtn.setBorderPainted(false);
        accountSettingsBtn.setContentAreaFilled(false);
        accountSettingsBtn.setFocusPainted(false);
        accountSettingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountSettingsBtn.setIconTextGap(15);
        accountSettingsBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        accountSettingsBtn.addActionListener(this::accountSettingsBtnActionPerformed);

        parkingTableBtn.setBackground(new java.awt.Color(14, 22, 40));
        sidePanelButtonGroup.add(parkingTableBtn);
        parkingTableBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        parkingTableBtn.setForeground(new java.awt.Color(157, 165, 177));
        parkingTableBtn.setText("Parking Table Details");
        parkingTableBtn.setBorderPainted(false);
        parkingTableBtn.setContentAreaFilled(false);
        parkingTableBtn.setFocusPainted(false);
        parkingTableBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        parkingTableBtn.setIconTextGap(15);
        parkingTableBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        parkingTableBtn.addActionListener(this::parkingTableBtnActionPerformed);

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(157, 165, 177));
        logoutBtn.setText("Logout");
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutBtn.setIconTextGap(15);
        logoutBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        logoutBtn.addActionListener(this::logoutBtnActionPerformed);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parkingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parkingTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parkingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parkingTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(sidePanel, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        // Ask for confirmation
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to logout?", "Logout", 
            javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        // Open the Login Frame
        new LoginFrame().setVisible(true);
        
        // Close the current Dashboard
        this.dispose();
    } else {
        // Deselect the button if they cancel
        logoutBtn.setSelected(false);
    }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "home");
    }//GEN-LAST:event_homeBtnActionPerformed

    private void parkingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkingBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "parking layout");
    }//GEN-LAST:event_parkingBtnActionPerformed

    private void parkingTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkingTableBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "parking table");
    }//GEN-LAST:event_parkingTableBtnActionPerformed

    private void accountSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "account settings");
        
        
        
        //MIHCAEL: FOR TESTING ONLY
        EmployeeInfoFrame EmpInfFrame = new EmployeeInfoFrame();
        EmpInfFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountSettingsBtnActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new DashboardFrameMain().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accountSettingsBtn;
    private javax.swing.JToggleButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToggleButton parkingBtn;
    private javax.swing.JToggleButton parkingTableBtn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.ButtonGroup sidePanelButtonGroup;
    // End of variables declaration//GEN-END:variables
}
