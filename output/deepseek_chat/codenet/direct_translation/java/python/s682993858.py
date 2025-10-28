
while True:
    s = input()
    if s == '0':
        break
    total = sum(int(c) for c in s)
    print(total)

