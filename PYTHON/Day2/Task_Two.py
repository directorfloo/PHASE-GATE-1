def get_average_score(number):
	if type(number) == float:
		raise ValueError
	if int(number) < 0:
		raise ValueError
	if type(number) == str:
		raise ValueError
	if average >= 90 and average <= 100:
    		return "A"
	elif average >= 80 and average < 90:
    		return "B";
	elif average >= 70 and average < 80:
      		return "C";
	elif average >= 60 and average < 70:
     		return "D";
	elif average >= 60 and average < 70:
    		 return "F";
	else: 
     		return "invalid input";