
import sys

def main():
    data = sys.stdin.read().split()
    A = int(data[0])
    B = int(data[1])
    n = int(data[2])
    
    if A == 0:
        if B == 0:
            print(1)
        else:
            print("No solution")
        return
    
    if B % A != 0:
        print("No solution")
        return
    
    B = B // A
    neg = B < 0
    
    if neg and n % 2 == 0:
        print("No solution")
        return
    
    if neg:
        B = -B
    
    x = 0
    while x <= B:
        if pow(x, n) == B:
            if neg:
                print(-x)
            else:
                print(x)
            return
        x += 1
    
    print("No solution")

if __name__ == "__main__":
    main()

