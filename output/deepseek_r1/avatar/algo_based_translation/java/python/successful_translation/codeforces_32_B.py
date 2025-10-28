
n = input().strip()
s = False
for c in n:
    if c == '.':
        if s:
            print('1', end='')
            s = False
        else:
            print('0', end='')
    else:
        if s:
            print('2', end='')
            s = False
        else:
            s = True

