
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    min_val = a[0]
    max_val = a[-1]
    mins = 0
    maxs = 0
    for num in a:
        if num == min_val:
            mins += 1
        if num == max_val:
            maxs += 1
    if min_val == max_val:
        print(0, n * (n - 1) // 2)
    else:
        print(max_val - min_val, mins * maxs)

if __name__ == "__main__":
    main()

