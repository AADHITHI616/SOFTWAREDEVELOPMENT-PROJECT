private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String name = txtName.getText();

int Mark1 = Integer.parseInt(txtMark1.getText().trim());

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int choice = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to exit?",
        "Exit",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (choice == javax.swing.JOptionPane.YES_OPTION) {
    System.exit(0);
}
