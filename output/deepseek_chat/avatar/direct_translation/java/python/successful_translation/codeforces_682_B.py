
import sys

def main():
    n = int(sys.stdin.readline())
    lst = list(map(int, sys.stdin.readline().split()))
    lst.sort()
    c = 1
    for num in lst:
        if num >= c:
            c += 1
    print(c)

if __name__ == "__main__":
    main()

