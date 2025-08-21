import unittest
import grocery

class TestGrocery(unittest.TestCase):

    def setUp(self):
     	grocery.itemList.clear()

    def test_add_item(self):
        grocery.addMyItem("Milk")
        self.assertEqual(grocery.itemList, ["Milk"])

    

