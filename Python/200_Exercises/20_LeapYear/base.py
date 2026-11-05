year = input("Please give me a year for me to tell you whether its a leap year or not!  ")
year = int (year)
if year % 4 !=0:
    print(str(year) + " Is not a leap year.")
elif year % 100 == 0 and year % 400 !=0:
    print (str(year) + " Is not a leap year.")
else:
    print(str(year) + " Is a leap year.")