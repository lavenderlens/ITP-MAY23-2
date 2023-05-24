# equivalent to array in JS, ArrayList in Java
numbers = [2,4,6,8]
print(len(numbers))
print(numbers[0])
print(numbers[3])
# print(numbers[4])#IndexError: list index out of range

for x in range(1,6):#end index 6 is exclusive - 1 beyond the last one
    print(x)