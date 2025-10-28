
while True:
    parts = input().split()
    op = parts[1]
    if op == '?':
        break
    a = int(parts[0])
    b = int(parts[2])
    if op == '+':
        print(a + b)
    elif op == '-':
        print(a - b)
    elif op == '*':
        print(a * b)
    elif op == '/':
        print(int(a / b))

