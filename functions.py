# no input, no output
def greet1():
    print("Hello")
    print("World greet1")
    print("How are you today?")

greet1()

# no input, output
def greet2():
    return "Hello \nWorld greet2 \nHow are you today?"

# greet2()#no visible output but will return value to system
# 2 choices: persist or pass
greet2Output = greet2()
print(greet2Output)
print(greet2())

# input, output
def greet3(name):
    return "Hello \n"+ name +" greet3 \nHow are you today?"

print(greet3("Jenny"))

# input, no output
def greet4(name):
    print(f"Hello \n{name} greet4 \nHow are you today?")

greet4("Evie")#no need to pass to any function
greet4Output = greet4("Prav")
print(greet4Output)#None