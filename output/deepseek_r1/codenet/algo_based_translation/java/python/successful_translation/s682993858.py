
tokens = []
while True:
    if not tokens:
        line = input()
        tokens = line.split()
        if not tokens:
            continue
    s = tokens.pop(0)
    if s == '0':
        break
    total = sum(int(c) for c in s)
    print(total)

