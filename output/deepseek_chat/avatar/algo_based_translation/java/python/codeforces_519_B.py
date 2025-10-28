
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    index = 1
    
    a = 0
    for i in range(n):
        a += int(data[index])
        index += 1
    
    b = 0
    for i in range(n - 1):
        b += int(data[index])
        index += 1
    
    c = 0
    for i in range(n - 2):
        c += int(data[index])
        index += 1
    
    x = a - b
    y = b - c
    
    print(x)
    print(y)

if __name__ == "__main__":
    main()

