#iterate every item 
fruits = ['apple', 'pear', 5]
for fruit in fruits:
    print(fruit)

#selection operation
fruits = ['apple', 'pear', 5]
for fruits in fruits:
    if(fruits=='pear'):
       print("pear")
    else:
        print("not pear")

#iterating using iterator variable 
for x in range(0,3):
    if fruits[x]=="pear":
        print(fruits[x])
    else:
        print("Not pear")

#using len() function
for x in range(len(fruits)):
    if fruits[x]=="pear":
        print(fruits[x])
    else:
        print("Not pear")
