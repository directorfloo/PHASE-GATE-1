import unittest
import Task_Two
class TestCaseDivideOrSquareFunction(unittest.TestCase):       
       def test_average_score_exist(self):
                Task_Two.get_average_score(5)
       def test_that_average_score_is_valid(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 2.823)
       def test_average_score_is_valid2(self):
                self.assertRaises(ValueError, Task_Two.get_average_score,-1)
       def test_average_score_is_valid3(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, "ola")
       def test_average_score_is_valid4(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 90)
       def test_average_score_is_valid4(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 80)
       def test_average_score_is_valid5(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 70)
       def test_average_score_is_valid6(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 67)
       def test_average_score_is_valid7(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, 59)
       def test_average_score_is_valid8(self):
                self.assertRaises(ValueError, Task_Two.get_average_score, "invalid input")