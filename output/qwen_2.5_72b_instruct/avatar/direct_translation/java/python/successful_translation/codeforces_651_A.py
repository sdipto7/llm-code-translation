
import sys

def main():
    import sys
    import math
    import collections
    from sys import stdin, stdout
    input = stdin.read().split()
    a = int(input[0])
    b = int(input[1])
    c = 0
    if a == 1 and b == 1:
        stdout.write(str(0) + '\n')
    else:
        while a >= 1 or b >= 1:
            if a >= b:
                b += 1
                a -= 2
            else:
                a += 1
                b -= 2
            if a <= 0 or b <= 0:
                c += 1
                break
            c += 1
        stdout.write(str(c) + '\n')

def swap(a, b):
    t = b
    b = a
    a = t

def debug(*obj):
    import pprint
    pp = pprint.PrettyPrinter(stream=sys.stderr)
    pp.pprint(obj)

main()

