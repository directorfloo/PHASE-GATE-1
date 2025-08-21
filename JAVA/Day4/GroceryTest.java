import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GroceryTest {

    @Test
    public void testAddItem() {
        // Arrange
        Grocery.itemList.clear(); // reset before test
        Grocery grocery = new Grocery();

        // Act
        grocery.addMyItem("Milk");

        // Assert
        assertEquals(1, Grocery.itemList.size());
        assertEquals("Milk", Grocery.itemList.get(0));
    }

    @Test
    public void testRemoveItem() {
        // Arrange
        Grocery.itemList.clear();
        Grocery grocery = new Grocery();
        grocery.addMyItem("Bread");

        // Act
        grocery.removeMyItem("Bread");

        // Assert
        assertEquals(0, Grocery.itemList.size());
        assertFalse(Grocery.itemList.contains("Bread"));
    }

    @Test
    public void testRemoveItemThatDoesNotExist() {
        // Arrange
        Grocery.itemList.clear();
        Grocery grocery = new Grocery();
        grocery.addMyItem("Eggs");

        // Act
        grocery.removeMyItem("Juice");

        // Assert
        assertEquals(1, Grocery.itemList.size());
        assertTrue(Grocery.itemList.contains("Eggs"));
    }

 
    }


