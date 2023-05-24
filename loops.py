ingredients = ["chicken", "breadcrumbs", "salt", "garlic", "lemon", "rocket"]
# for loop
ingredient = 'a global ingredient variable'
print('using for loop')
print('value of ingredient before loop: ' + ingredient)
for ingredient in ingredients:
    print(ingredient)

print(ingredient)#rocket - memory leakage
print('value of ingredient AFTER loop: ' + ingredient)
# this may have implications

# while loop
print('using while loop')
counter = 0
while counter < len(ingredients):
    print(ingredients[counter])
    counter += 1 #very important!

print(counter)#6
# print(ingredients[counter])#IndexError: list index out of range
# using while loop with break
print("using while loop with break")
counter = 0
while counter < len(ingredients):
    if ingredients[counter] == 'breadcrumbs':
        break#chicken only
    print(ingredients[counter])
    counter += 1 #very important!

# using while loop with continue
print("using while loop with continue")
counter = 0
while counter < len(ingredients):
    if ingredients[counter] == 'breadcrumbs':
        counter += 1
        continue#chicken only
    print(ingredients[counter])
    counter += 1 #very important!


