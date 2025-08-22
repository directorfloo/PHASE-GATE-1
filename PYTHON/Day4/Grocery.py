itemList = []
mainMenu = True

while mainMenu:
    menu_text = """
          WELCOME TO SEMICOLON GROCERY STORE  
            
            choose from the menu:

        1. Add items	
        2. Remove items
        3. Show an item
        0. Exit
    """
    print(menu_text)
    choice = int(input("Enter choice 1, 2, 3 or 0 to quit: "))

    if choice == 1:
        print("1. Add items: ")
        userInput = input("Enter item: ")
        
	def addMyItem(addItem):
            itemList.append(addItem)
            print(itemList)
            return "list"
        addMyItem(userInput)

    elif choice == 2:
        print("2. Remove items")
        removeItem = input("Enter item to remove: ")
        def removeMyItem(removeItem):
            if removeItem in itemList:
                itemList.remove(removeItem)
            print(itemList)
            return "list"
        removeMyItem(removeItem)

    elif choice == 3:
        print("3. Show an item")
        def showItem():
            for index in range(len(itemList)):
                print(itemList[index])
        showItem()

    elif choice == 0:
        mainMenu = False
        print("Good bye")
