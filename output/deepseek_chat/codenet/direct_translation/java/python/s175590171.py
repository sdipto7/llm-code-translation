
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    total = 0
    count = 0
    for i in range(n - 1):
        total += a[i]
        if a[i + 1] <= 2 * total:
            count += 1
        else:
            count = 0
    print(count + 1)

if __name__ == "__main__":
    main()

