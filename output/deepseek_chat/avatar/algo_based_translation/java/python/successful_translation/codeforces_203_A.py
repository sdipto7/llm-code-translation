
import sys

def main():
    data = sys.stdin.read().split()
    x = int(data[0])
    t = int(data[1])
    a = int(data[2])
    b = int(data[3])
    da = int(data[4])
    db = int(data[5])
    
    ok = False
    
    for i in range(t):
        first = a - (da * i)
        for j in range(t):
            second = b - (db * j)
            if (first + second == x) or (second == x) or (first == x) or (x == 0):
                ok = True
                break
    
    if ok:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

