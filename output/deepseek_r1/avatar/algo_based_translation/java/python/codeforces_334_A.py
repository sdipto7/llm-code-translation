
import sys

def debug(*obj):
    print(*obj, file=sys.stderr)

n = int(input())
square = n * n
odd = []
even = []
for i in range(1, square + 1):
    if i % 2 == 1:
        odd.append(i)
    else:
        even.append(i)
loop = square // n
div = loop // 2
debug(div)
for i in range(1, loop + 1):
    line = ""
    for _ in range(div):
        if i % 2 == 1:
            a = odd.pop(0)
            b = even.pop()
        else:
            a = even.pop(0)
            b = odd.pop()
        line += f"{a} {b} "
    print(line)

