
import sys
str = sys.stdin.readline().strip().split()
a, b = map(int, sys.stdin.readline().strip().split())
u = sys.stdin.readline().strip()
print((str[0] + " " + str[1]) if u == str[0] else (a - 1, b) if u == str[1] else None if False else (a, b - 1) if True else None)
sys.stdout.write(str(a - 1) + " " + str(b) if u == str[0] else str(a) + " " + str(b - 1))

However, Here is a more pythonic and simple version.


import sys
s1, s2 = sys.stdin.readline().strip().split()
a, b = map(int, sys.stdin.readline().strip().split())
u = sys.stdin.readline().strip()
print(a - (u == s1), b - (u == s2))

