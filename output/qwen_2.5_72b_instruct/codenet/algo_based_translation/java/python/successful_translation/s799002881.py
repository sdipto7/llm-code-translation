
import sys

def main():
    import sys
    import math
    
    input = sys.stdin.read().strip().split('\n')
    str = input[0].split()
    n = int(str[0])
    d = float(str[1])
    cnt = 0

    for i in range(n):
        str = input[i+1].split()
        x = float(str[0])
        y = float(str[1])
        if math.sqrt(x*x + y*y) <= d:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()

