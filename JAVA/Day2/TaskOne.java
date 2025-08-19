public class TaskOne {

public static int ageCalculation(int fatherAge, int sonAge) {
int digit = sonAge * 2;
int difference = fatherAge - digit;
return difference;
}

public static void main(String...args){
int calculation  = ageCalculation(30,10);
System.out.print(calculation);
}
}