
import sys
n = input().strip()
s = False
for c in n:
    if c == '.':
        if s:
            sys.stdout.write('1')
            s = False
        else:
            sys.stdout.write('0')
    else:
        if s:
            sys.stdout.write('2')
            s = False
        else:
            s = True

