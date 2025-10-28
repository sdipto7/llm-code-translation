
import sys
from array import array

def swap(a, b):
    t = b
    b = a
    a = t

def debug(*obj):
    print(*obj, file=sys.stderr)

def main():
    data = sys.stdin.read().split()
    a = int(data[0])
    b = int(data[1])
    c = 0
    
    if a == 1 and b == 1:
        print(0)
        return
    
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
    
    print(c)

if __name__ == "__main__":
    main()

