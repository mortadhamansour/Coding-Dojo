# 1
for i in range (0, 151):
    print(i)
# 2
for i in range (5, 1001, 5):
    print(i)
# 3
for i in range(0 , 1001):
    if i % 10 == 0:
        print("Coding Dojo")
    elif i % 5 == 0:
        print("Coding")
    else:
        print(i)
# 4
sum=0
for i in range (0, 500001):
    if i % 2 != 0:
        sum+=i
print(sum)
# 5 
for i in range (2018, 0, -4):
    if i > 0:
        print(i)
# 6
lowNum = 5 
highNum = 50
mult = 9
for i in range(lowNum, highNum):
    if i % mult == 0:
        print(i)
