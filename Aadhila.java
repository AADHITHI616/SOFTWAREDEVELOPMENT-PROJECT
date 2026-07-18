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
