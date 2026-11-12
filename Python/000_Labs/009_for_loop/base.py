x = int (input("Please enter line length: "))
y = str (input ("Do you want a horizontal or vertical line? "))
if y == "vertical":
    for y in range(x):
        print("*")
elif y == "horizontal":
    for x in range(x):
        print("*", end="")
    print("\n")


