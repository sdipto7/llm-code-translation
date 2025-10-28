import sys

def read_line():
    return sys.stdin.readline().strip()

s = read_line().split()
a = int(s[0])
b = int(s[1])
if b % a == 0:
    print(a + b)
else:
    print(b - a)
