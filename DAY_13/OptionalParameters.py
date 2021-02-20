#function with passed parameters
def func(name, num):
    print(name, num)

func("chetna", 45)

#function with default parameters
def func(name, num=23):
    print(name, num)

func("chetna")
func("chetna", 34)