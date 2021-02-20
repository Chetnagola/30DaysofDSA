age = input()
if int(age)>20:
    print("You can ride")
elif int(age)<20 and int(age)>10:
      print("You can ride till level 2 only")
else:
    print("You cannot ride")

#chained conditionals
x=1
y=2
if x==2:
    if y==3:
        print("x=2 and y=3")
    else:
        print("x=2 and y!=3")
else:
    print("x!=2")
