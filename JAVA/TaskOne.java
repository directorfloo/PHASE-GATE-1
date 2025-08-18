import java.util.Scanner;

	public class TaskOne {
	public static void main(String...args) {
	Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int number = input.nextInt();

			System.out.print("Enter the second integer: ");
			int number1 = input.nextInt();

			int digit = number * number;
				int  digit1 = number1 * number1;
				int digit2 = digit + digit1;
				int digit3 = digit - digit1;
 
					System.out.println(digit);
					System.out.println(digit1);
					System.out.println(digit2);
					System.out.println(digit3);



}

}


