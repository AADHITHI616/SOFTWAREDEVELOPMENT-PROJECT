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
