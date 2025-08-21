const prompt = require("prompt-sync")();

let itemList = [];
let mainMenu = true;

while (mainMenu) {
    let menuText = `
    
          WELCOME TO SEMICOLON GROCERY STORE  
            
            choose from the menu:

        1. Add items	
        2. Remove items
        3. Show an item
        0. Exit
    `;
    console.log(menuText);
    console.log("Enter choice 1, 2, 3 or 0 to quit: ");
    let choice = Number(prompt("> "));




    switch (choice) {
        case 1:
            console.log("1. Add items: ");
            let userInput = prompt("Enter item: ");  
            addMyItem(userInput);
            break;

        case 2:
            console.log("2. Remove items");
            let removeItem = prompt("Enter item to remove: ");
            removeMyItem(removeItem);
            break;

        case 3:
            console.log("3. Show an item");
            showItem();
            break;

        case 0:
            mainMenu = false;
            console.log("Good bye");
            break;

        default:
            console.log("Invalid choice. Try again.");
}
}
function addMyItem(addItem) {
    itemList.push(addItem);
    console.log(itemList);
    return "list";
}

function removeMyItem(removeItem) {
    let index = itemList.indexOf(removeItem);
    if (index !== -1) {
        itemList.splice(index, 1);
}
    console.log(itemList);
    return "list";
}

function showItem() {
    for (let index = 0; index < itemList.length; index++) {
        console.log(itemList[index]);
}
}
