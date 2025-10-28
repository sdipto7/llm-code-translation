import math
import sys

def main():
    data = sys.stdin.readline().split()
    n = int(data[0])
    d = float(data[1])
    cnt = 0
    
    for i in range(n):
        line = sys.stdin.readline().split()
        x = float(line[0])
        y = float(line[1])
        distance = math.sqrt(x*x + y*y)
        if distance <= d:
            cnt += 1
            
    print(cnt)

if __name__ == "__main__":
    main()
