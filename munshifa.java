int Mark4 = Integer.parseInt(txtMark4.getText().trim());
int Mark5 = Integer.parseInt(txtMark5.getText().trim());

private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String name = txtName.getText();

int Mark1 = Integer.parseInt(txtMark1.getText().trim());
int Mark2 = Integer.parseInt(txtMark2.getText().trim());
int Mark3 = Integer.parseInt(txtMark3.getText().trim());
int Mark4 = Integer.parseInt(txtMark4.getText().trim());
int Mark5 = Integer.parseInt(txtMark5.getText().trim());

int Total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
lblTotal.setText(String.valueOf(Total));

double average = Total / 5.0;
lblAverage.setText(String.valueOf(average));

// Grade
if (average >= 75) {
    lblGrade.setText("A");
} else if (average >= 65) {
    lblGrade.setText("B");
} else if (average >= 55) {
    lblGrade.setText("C");
} else if (average >= 35) {
    lblGrade.setText("D");
} else {
    lblGrade.setText("F");
}

// Result
if (average >= 35) {
    lblResult.setText("PASS");
} else {
    lblResult.setText("FAIL");
}

// Highest
int[] Marks = {Mark1, Mark2, Mark3, Mark4, Mark5};

int Highest = Marks[0];

for (int i = 0; i < Marks.length; i++) {
    if (Marks[i] > Highest) {
        Highest = Marks[i];
    }
}

lblHighest.setText(String.valueOf(Highest));
 
// Lowest Mark
int Lowest = Marks[0];

for (int i = 0; i < Marks.length; i++) {
    if (Marks[i] < Lowest) {
        Lowest = Marks[i];
    }
}

lblLowest.setText(String.valueOf(Lowest));

String grade = lblGrade.getText();

 
 switch (grade) {
    case "A" -> lblMessage.setText("Excellent");

    case "B" -> lblMessage.setText("Very Good");

    case "C" -> lblMessage.setText("Good");

    case "D" -> lblMessage.setText("Pass");

    case "F" -> lblMessage.setText("Fail");

    default -> lblMessage.setText("-");
    
    
}

    }                                            
