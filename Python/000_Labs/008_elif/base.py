x = input("Please enter a number: ")
y = input("Please enter an operation: ")
xy = input("Please enter another number: ")
if y == "+":
    print(int(x) + int(xy))
elif y == "-":
    print(int(x) - int(xy))
elif y == "*":
    print(int(x) * int(xy))
elif y == "/":
    print(int(x) / int(xy))