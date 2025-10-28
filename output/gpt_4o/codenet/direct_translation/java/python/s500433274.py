
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    if a > b:
        print("GREATER")
    elif b > a:
        print("LESS")
    else:
        print("EQUAL")

