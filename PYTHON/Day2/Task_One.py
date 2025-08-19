def get_age_father(sonAge, fatherAge):
	if type(sonAge) == float:
		raise ValueError
	if type(sonAge) == str:
		raise ValueError
	digit = sonAge * 2
	difference = fatherAge - digit
	return difference
