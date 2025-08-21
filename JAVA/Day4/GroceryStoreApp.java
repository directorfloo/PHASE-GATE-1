import java.util.Scanner;
import java.util.ArrayList;
public class GroceryStoreApp {
public static ArrayList<String> itemList = new ArrayList<>();
public static void main(String...args){
Scanner input = new Scanner(System.in);
boolean mainMenu = true;

while(mainMenu){
   String prompt =("""

		  WELCOME TO SEMICOLON GROCERY STORE  
			
			choose from the menu:

		1. Add items	
		2. Remove items
		3. Show an item
		0. Exist
		""");	
System.out.print(prompt);     	
System.out.print("Enter choice 1, 2, 3 or 0 to quit: ");
int option = input.nextInt();
input.nextLine();

switch(option) {
	case 1: System.out.print("1. Add items: ");
                String userInput = input.nextLine();
                Grocery.addMyItem(userInput);
                break;
		
	
	case 2: System.out.println("2. Remove items");
                String removeItem = input.nextLine();
                Grocery.removeMyItem(removeItem);
		break;
	
	case 3: System.out.println("3. Show an item");
                String showItem = input.nextLine();
                Grocery.showItem();
		break;
	case 0:
		mainMenu = false;
		System.out.print("Good bye");
		break;
		
}		
}
}

public static String addMyItem(String addItem){
		itemList.add(addItem);
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