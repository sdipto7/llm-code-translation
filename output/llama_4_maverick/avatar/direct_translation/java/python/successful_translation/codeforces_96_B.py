
number = int(input())
ans = -1
value = 0
mask = 2
while value < number:
    s = bin(mask)[3:]
    mask += 1
    zeros = s.count('0')
    if zeros != len(s) - zeros:
        continue
    s = s.replace('0', '4').replace('1', '7')
    value = int(s)
print(value)

