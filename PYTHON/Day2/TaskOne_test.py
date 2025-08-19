import unittest
import Task_One
class TestCaseAgeFather(unittest.TestCase):       

	def test_get_age_father_exist(self):
                Task_One.get_age_father(3)
       
	def test_that_get_age_father_is_valid(self):
                self.assertRaises(ValueError, Task_One.get_age_father, 2.823)
       
	def test_that_get_age_father_is_valid2(self):
                self.assertRaises(ValueError, Task_One.get_age_father, "Ebuka")
	       
	def test_that_divide_or_square_correct_result(self):
		result = Task_One.get_age_father(10)
		self.assertNotEqual(result, 1.4)

       