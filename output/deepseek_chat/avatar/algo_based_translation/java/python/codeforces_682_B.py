
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    arr = list(map(int, data[1:1+n]))
    arr.sort()
    c = 1
    for num in arr:
        if num >= c:
            c += 1
    print(c)

def debug(*obj):
    print(*obj, file=sys.stderr)

if __name__ == "__main__":
    main()

