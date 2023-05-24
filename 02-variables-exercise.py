name = input("Enter the account name: ")
number = int(input("Enter the account number: "))
balance = float(input("Enter the account balance: "))
isTaxable = bool(input("Enter the taxable flag (True or False): "))
# isTaxable = input("Enter the taxable flag (True or False): ")

# alright if you have one variable per string label
print("Name: " + name)
print("Number: " + str(number))
print("Balance: " + str(balance))
print("Is taxable: " + str(isTaxable))

# what about this?
print("All details: " + "\nName: " + name + "\nNumber: " + str(number) + "Balance: " + str(balance) + "Is taxable: " + str(isTaxable))
# Python 3 > placeholders with .format()
print("All details: \nName: {} \nNumber: {} \
       \nBalance: {} \nIs taxable: {}".format(name,number,balance,isTaxable))
# Python 3.5 > placeholders with f strings
# Python 3.7 > placeholders with triple f strings
print(f"""
All details: 
Name: {name} 
Number: {number} 
Balance: {balance + 100} 
Is taxable: {isTaxable}""")





print(type(isTaxable))

# if(isTaxable):
#     print("boolean") # why does this still print if isTaxable is False??

# I'm expecting the same as this:
if(False):
    print("boolean") # no printout

# if I explicitly assign isTaxable like this 
# AND, crucially, take away the bool() wrapper from line 4
# it works - but why is this different?

# if(isTaxable == 'True'):
#     isTaxable = True
# elif(isTaxable == 'False'):
#     isTaxable = False

# remove bool() wrapper line 4
isTaxable = None # direct assignment
if(isTaxable):
    print("boolean") # no printout if isTaxable is False

print(bool(0))
print(bool(1))
print(bool(99))
print(bool(''))
print(bool('non-empty'))
print(bool(None))





