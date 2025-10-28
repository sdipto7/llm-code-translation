
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().split()))
    if len(a) != n:
        a = []
        for _ in range(n):
            a.append(int(sys.stdin.readline().strip()))
    count = 1
    now = 0
    bef = 0
    for i in range(1, n):
        if a[i-1] < a[i]:
            now = 1
        elif a[i-1] > a[i]:
            now = -1
        else:
            continue
        if bef == 0:
            bef = now
        if bef != now:
            count += 1
            bef = 0
    print(count)

if __name__ == "__main__":
    main()

