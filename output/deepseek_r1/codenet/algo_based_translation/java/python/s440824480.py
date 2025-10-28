
import sys

def main():
    n = int(sys.stdin.readline())
    c = 0
    flg = 0
    while n > 0:
        x, y = map(int, sys.stdin.readline().split())
        if x == y:
            c += 1
            if c >= 3:
                flg = 1
        else:
            c = 0
        n -= 1
    print("Yes" if flg else "No")

if __name__ == "__main__":
    main()

