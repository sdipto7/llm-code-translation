
import sys

def main():
    import sys
    from collections import deque
    
    n = int(sys.stdin.readline().strip())
    c = 0
    flg = 0
    for _ in range(n):
        x, y = map(int, sys.stdin.readline().strip().split())
        if x == y:
            c += 1
            if c >= 3:
                flg = 1
        else:
            c = 0
    if flg == 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

