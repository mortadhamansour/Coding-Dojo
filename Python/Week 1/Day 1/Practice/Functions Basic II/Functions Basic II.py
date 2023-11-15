# Countdown 
def Countdown(num):
    for num in range(num, -1, -1):
        print(num)
Countdown(5)

# Print and Return
def print_and_return(num_list):
    print(num_list[0])
    print(num_list[1])
print_and_return(['1', '2'])

# First Plus Length
def  first_plus_length(num_list):
    print(num_list[0] + len(num_list))
first_plus_length([1,5,2,7,5,9])

# Values Greater than Second
new_arr = []
def  values_greater_than_second(arr):
    if len(arr) < 2:
        return(false)
    for i in range(0, len(arr), 1):
        if arr[i] > arr[1]:
            new_arr.append(arr[i])
    print(len(new_arr))
    return(new_arr)
values_greater_than_second([2,5,8,4,6,9,1])

# This Length, That Value 
new_arr = []
def  length_and_value(arr):
    for i in range(0 , arr[0] ,1):
        if i < arr[0]:
            new_arr.append(arr[1])
    print(new_arr)
length_and_value([5,10])