
import sys

number = int(sys.stdin.readline().strip())
ans = -1
value = 0
mask = 2
while value < number:
    s = bin(mask)[3:]
    zeros = s.count('0')
    if zeros != len(s) - zeros:
        mask += 1
        continue
    s = s.replace('0', '4').replace('1', '7')
    value = int(s)
    mask += 1
print(value)

