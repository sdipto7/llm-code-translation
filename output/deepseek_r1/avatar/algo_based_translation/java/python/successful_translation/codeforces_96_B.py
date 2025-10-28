
number = int(input())
value = 0
mask = 2

while value < number:
    bin_str = bin(mask)[2:]
    s = bin_str[1:]
    zeros = s.count('0')
    if zeros == len(s) - zeros:
        s = s.replace('0', '4').replace('1', '7')
        value = int(s)
    mask += 1

print(value)

