'''
declaring a variable in Python uses no special keyword
big difference to other languages
so a name, which is not a reserved system keyword already
is a new variable in Python
it has to be initialised (assigned a initial value)
'''

# whole number
myNumber = 42

# decimal point number
myFloatNumber = 42.0

print(type(myNumber))#<class 'int'>
print(type(myFloatNumber))#<class 'float'>

# print(1.0/0.3)//3.3333333333333335

# print("value of mynumber = " + myNumber)#TypeError: can only concatenate str (not "int") to str
print("value of mynumber = " + str(myNumber))

# ask the user for intput
name = input("Enter your name")
print(name)

num1 = input("Enter a number")
num1 = int(num1)
num2 = float(input("Enter another number"))
sum = num1 + num2
print(sum)

myboolean = True
myboolean2 = False

enterABoolean = bool(input("enter a boolean"))


