/*the clear a variable 
Using the while loop to loop through the method
Use booleen data type
promt the user
using switch case*/






import java.util.Scanner;
import java.util.Array;
public class ParkingSlot {
public static String[] motoPark = int[20];
public static void main(String...args){
Scanner input = new Scanner(System.in);
boolean mainMenu = true;

while(mainMenu){
   String prompt =("""

		  SEMI COLON PARKING SPACE  
			
			choose from the menu:

		1. Park your car	
		2. Remove your car
		3. Show all available parking space
		0. Exist
		""");	
System.out.print(prompt);     	
System.out.print("Enter choice 1, 2, 3 or 0 to quit: ");
int option = input.nextInt();
input.nextLine();

switch(option) {
	case 1: System.out.print("1. Park your car ");
                int userInput = input.nextLine();
                ParkingSlot.addItem(userInput);
                break;
		
	
	case 2: System.out.println("2. Remove items");
                int removeItem = input.nextLine();
                ParkingSlot.removeMyItem(removeItem);
		break;
	
	case 3: System.out.println("3. Show all available parking space");
                String showItem = input.nextLine();
                ParkingSlot.showItem();
		break;
	case 0:
		mainMenu = false;
		System.out.print("Good bye");
		 break;
		
}		
}
}

public static int automobileCar (int numberOfCar){
for(let index = 0; index < carpark.length; index++ )
		System.out.println(itemList);
return "list";
}
public static String removeMyItem(String removeItem){
		itemList.remove(removeItem);
		System.out.println(itemList);
return "list";
}
public static void showItem(){
for(int index = 0; index < itemList.size(); index++){
System.out.println(itemList.get(index));

}
}

}