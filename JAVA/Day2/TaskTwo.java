public class TaskTwo {

public static char averageScore(int score1 , int score2, int score3) {
int average = (score1 + score2 + score3) / 3;
if( average >= 90 && average <= 100){
    return 'A';
} else if ( average >= 80 && average < 90){
    return 'B';
} else if ( average >= 70 && average < 80){
      return 'C';
} else if ( average >= 60 && average < 70){
     return 'D';
} else {
     return 'F';
}
}
public static void main(String...args) {
char calculationScore = averageScore(90, 90, 90);
System.out.print(calculationScore);
}
}