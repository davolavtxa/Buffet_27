x = int(input ("Please enter a number: "))
xy = 0
for y in range(1,x):
    print (y, end="+")
    xy = xy + y 
    print(x)
    xy=xy+y

print (" The sum is: " + str(xy))
