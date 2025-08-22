import unittest
import ParkingSlot

class TestParkingSlot(unittest.TestCase):

    def setUp(self):
     	ParkingSlot.itemList.clear()

    def test_add_item(self):
        ParkingSlot.addMyItem("jeep")
        self.assertEqual(ParkingSlot.itemList, ["jeep"])