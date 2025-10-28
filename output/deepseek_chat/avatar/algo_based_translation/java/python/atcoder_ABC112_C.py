
import sys

MAX = 100

def main():
    n = int(input().strip())
    x = []
    y = []
    h = []
    
    for _ in range(n):
        data = input().split()
        x.append(int(data[0]))
        y.append(int(data[1]))
        h.append(int(data[2]))
    
    for i in range(MAX + 1):
        for j in range(MAX + 1):
            ch = check(n, x, y, h, i, j)
            if ch > 0:
                print(f"{i} {j} {ch}")
                return

def check(n, x, y, h, cx, cy):
    ch = -1
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    
    for i in range(n):
        expected_height = max(ch - abs(x[i] - cx) - abs(y[i] - cy), 0)
        if h[i] != expected_height:
            return -1
    
    return ch

if __name__ == "__main__":
    main()

