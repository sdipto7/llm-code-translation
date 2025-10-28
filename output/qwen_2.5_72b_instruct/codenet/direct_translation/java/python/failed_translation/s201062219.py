
import sys

scan = sys.stdin
mark = ''
c = 0
b = 0
a = [0] * 100000
x = 0

while True:
    c = int(scan.readline().strip())
    mark = scan.readline().strip()
    b = int(scan.readline().strip())
    if mark == "?":
        a[x] = 2000001
        break
    elif mark == "+":
        a[x] = c + b
    elif mark == "-":
        a[x] = c - b
    elif mark == "*":
        a[x] = c * b
    elif mark == "/":
        a[x] = c // b
    x += 1

x = 0
while True:
    if a[x] == 2000001:
        break
    print(a[x])
    x += 1

