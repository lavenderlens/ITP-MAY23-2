class Musician:
    #constructor
    def __init__(self, name, age, instruments):
        self.name = name
        self.age = age
        self.instruments = instruments
    #other functions
    # def printAll(self):
    def __str__(self):
        # using f-strings and placeholders
        return f'Musician {self.name} is {self.age} years old and plays {self.instruments}'

kurt = Musician("Kurt Ramm", 55, ["trumpet"]);
print(kurt)#Musician Kurt Ramm is 55 years old and plays ['trumpet']