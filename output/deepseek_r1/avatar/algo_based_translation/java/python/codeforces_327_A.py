
import sys

def main():
    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    if n == 1:
        print(1 if arr[0] == 0 else 0)
        return
    max_ones = -float('inf')
    for i in range(n):
        for j in range(i, n):
            brr = arr.copy()
            for k in range(i, j+1):
                brr[k] = 1 - brr[k]
            current = sum(brr)
            if current > max_ones:
                max_ones = current
    print(max_ones)

if __name__ == "__main__":
    main()

