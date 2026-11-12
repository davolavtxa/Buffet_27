Symbol = str (input ("What symbol would you like to use? "))
Width = int (input ("What's the width of your box? "))
Height = int (input ("What's the height of your box? "))
for x in range(0, Height):
    for y in range(0, Width):
        print(Symbol, end="")
    print()
  
    