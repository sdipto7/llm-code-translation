
a = int(input())
b = input()
bStr = ""
for char in b:
    if char != '.':
        bStr += char
bInt = int(bStr)
result = (a * bInt) // 100
print(result)

