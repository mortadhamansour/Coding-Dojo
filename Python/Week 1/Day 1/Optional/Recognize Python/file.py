num1 = 42 # variable declaration Numbers
num2 = 2.3 # variable declaration Numbers
boolean = True # variable declaration Boolean
string = 'Hello World' # variable declaration Strings
pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives'] # variable declaration List initialize
person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False} # variable declaration
fruit = ('blueberry', 'strawberry', 'banana') # variable declaration
print(type(fruit)) #log statement
print(pizza_toppings[1]) #log statement
pizza_toppings.append('Mushrooms')
print(person['name']) #log statement
person['name'] = 'George'
person['eye_color'] = 'blue'
print(fruit[2]) #log statement

if num1 > 45: #if
    print("It's greater") # log statment
else: #else
    print("It's lower") # log statment

if len(string) < 5: #if
    print("It's a short word!") # log statment
elif len(string) > 15:
    print("It's a long word!") # log statment
else:
    print("Just right!") # log statment

for x in range(5):
    print(x) # log statment
for x in range(2,5):
    print(x) # log statment
for x in range(2,10,3):
    print(x) # log statment
    #while loop
x = 0 #start
while(x < 5): #stop
    print(x) # log statment
    x += 1  #increment

pizza_toppings.pop() #delete value 
pizza_toppings.pop(1) #add value

print(person) # log statment
person.pop('eye_color') #delete value
print(person) # log statment

for topping in pizza_toppings:
    if topping == 'Pepperoni': #if
        continue #continue
    print('After 1st if statement') # log statment
    if topping == 'Olives': #if
        break #break

def print_hello_ten_times():
    for num in range(10): #for loop
        print('Hello') # log statment

print_hello_ten_times()

def print_hello_x_times(x):
    for num in range(x): #for loop
        print('Hello') # log statment

print_hello_x_times(4)

def print_hello_x_or_ten_times(x = 10):
    for num in range(x): #for loop
        print('Hello') # log statment

print_hello_x_or_ten_times()
print_hello_x_or_ten_times(4)


"""
Bonus section # comment multiline
"""

# print(num3) #comment single line
# num3 = 72 #comment single line
# fruit[0] = 'cranberry' #comment single line
# print(person['favorite_team']) #comment single line
# print(pizza_toppings[7]) #comment single line
#   print(boolean) #comment single line
# fruit.append('raspberry') #comment single line
# fruit.pop(1) #comment single line