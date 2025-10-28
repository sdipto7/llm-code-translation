
while True:
    s = input().strip()
    if s == '0':
        break
    print(sum(int(c) for c in s))

