
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    if not data:
        return
    n = data[0]
    if n < 1:
        print(0)
        return
    numbers = data[1:1 + n]
    if not numbers:
        print(0)
        return
    minv = numbers[0]
    maxv = -float('inf')
    for i in range(1, len(numbers)):
        ri = numbers[i]
        maxv = max(maxv, ri - minv)
        minv = min(minv, ri)
    print(int(maxv) if maxv != -float('inf') else maxv)

if __name__ == "__main__":
    main()

