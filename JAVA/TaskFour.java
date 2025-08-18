import java.util.Scanner;

public class TaskFour {
public static void main(String...args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number = input.nextInt();

if(number > 0) {
System.out.print( "Positive number");
}else{
	System.out.print( "Negative number");
}
}
}