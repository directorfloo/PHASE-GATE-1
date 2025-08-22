import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GroceryTest {

    @Test
    public void testAddItem() {
        // Arrange
        Grocery.itemList.clear(); // reset before test
        ParkingSlot parkingslot = new  ParkingSlot();

        // Act
        parkingslot.addMyItem("jeep");

        // Assert
        assertEquals(1,  ParkingSlot.itemList.size());
        assertEquals("jeep",  ParkingSlot.itemList.get(0));
    }

    @Test
    public void testRemoveItem() {
        // Arrange
       ParkingSlot.itemList.clear();
        ParkingSlot parkingslot = new ParkingSlot();
        ParkingSlot.addMyItem("toyota");

        // Act
        ParkingSlot.removeMyItem("toyota");

        // Assert
        assertEquals(0, ParkingSlot.itemList.size());
        assertFalse(ParkingSlot.itemList.contains("toyota"));
    }

    @Test
    public void testRemoveItemThatDoesNotExist() {
        // Arrange
        ParkingSlot.itemList.clear();
        ParkingSlot parkingslot = new ParkingSlot();
        grocery.addMyItem("Benz");

        // Act
        parkingslot.removeMyItem("Benz");

        // Assert
        assertEquals(1, ParkingSlot.itemList.size());
        assertTrue(ParkingSlot.itemList.contains("Benz"));
    }

 
    }


