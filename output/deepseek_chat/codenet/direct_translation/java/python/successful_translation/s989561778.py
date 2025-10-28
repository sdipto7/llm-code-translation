
import sys
import math

while True:
    line = sys.stdin.readline()
    if not line:
        break
    a, b = map(int, line.split())
    digit = int(math.log10(a + b)) + 1
    print(digit)

