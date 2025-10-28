
from sys import stdin

for line in stdin:
    a, b = map(int, line.split())
    c = max(a, b)
    if a == c and b != c:
        print("GREATER")
    elif b == c and a != c:
        print("LESS")
    else:
        print("EQUAL")

