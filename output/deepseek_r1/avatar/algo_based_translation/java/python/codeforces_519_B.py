
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    
    a = sum(data[ptr:ptr+n])
    ptr += n
    
    b = sum(data[ptr:ptr+(n-1)])
    ptr += (n-1)
    
    c = sum(data[ptr:ptr+(n-2)])
    
    x = a - b
    y = b - c
    
    print(x)
    print(y)

if __name__ == "__main__":
    main()

