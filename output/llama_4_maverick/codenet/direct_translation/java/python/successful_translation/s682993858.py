
while True:
    s = input().strip()
    if s == '0':
        break
    print(sum(int(digit) for digit in s))

