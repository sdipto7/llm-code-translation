
n = int(input())
mask, value = 2, 0
while value < n:
    s = bin(mask)[3:]
    z = s.count('0')
    if 2 * z != len(s):
        mask += 1
        continue
    value = int(s.replace('0','4').replace('1','7'))
    mask += 1
print(value)

