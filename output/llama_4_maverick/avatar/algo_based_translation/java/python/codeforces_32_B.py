
import sys
s = sys.stdin.readline().strip()
n = list(s)
s = False
for i in n:
    if i == '.':
        if s:
            print(1, end='')
            s = False
        else:
            print(0, end='')
    else:
        if s:
            print(2, end='')
            s = False
        else:
            s = True

