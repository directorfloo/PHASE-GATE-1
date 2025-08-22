#the clear a variable 
#Using the while loop to loop through the method
#Use booleen data type
#promt the user
#using switch case



itemList = [20]
mainMenu = True

while mainMenu:
    menu_text = """
          WELCOME TO SEMICOLON GROCERY STORE  
            
            choose from the menu:

        1. Park your car	
        2. Remove your car
        3. Show all avaible parking space
        0. Exit
    """
    print(menu_text)
    choice = int(input("Enter choice 1, 2, 3 or 0 to quit: "))

    if choice == 1:
        print("1. Park your car: ")
        userInput = input("Enter item: ")
        
	def addMyItem(addItem):
            itemList.append(addItem)
            print(itemList)
            return "list"
        addMyItem(userInput)

    elif choice == 2:
        print("2. Remove your car")
        removeItem = input("Enter item to remove: ")
        def removeMyItem(removeItem):
            if removeItem in itemList:
                itemList.remove(removeItem)
            print(itemList)
            return "list"
        removeMyItem(removeItem)

    elif choice == 3:
        print("3. Show all avaible parking space")
        def showItem():
            for index in range(len(itemList)):
                print(itemList[index])
        showItem()

    elif choice == 0:
        mainMenu = False
        print("Good bye")
