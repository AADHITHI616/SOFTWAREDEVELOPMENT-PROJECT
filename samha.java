int Mark2 = Integer.parseInt(txtMark2.getText().trim());
int Mark3 = Integer.parseInt(txtMark3.getText().trim());

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Clear Text Fields
txtName.setText("");
txtMark1.setText("");
txtMark2.setText("");
txtMark3.setText("");
txtMark4.setText("");
txtMark5.setText("");

// Clear Labels
lblTotal.setText("0");
lblAverage.setText("0");
lblGrade.setText("-");
lblResult.setText("-");
lblHighest.setText("0");
lblLowest.setText("0");
lblMessage.setText("-");
// Cursor back to Name
txtName.requestFocus();
    }                                        
