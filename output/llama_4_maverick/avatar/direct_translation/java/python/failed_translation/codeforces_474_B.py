
import sys
from bisect import bisect_left

def main():
    input = sys.stdin.readline
    n = int(input())
    arr = [0] * n
    arr[0] = int(input())
    for i in range(1, n):
        arr[i] = int(input()) + arr[i - 1]
    m = int(input())
    q = [int(input()) for _ in range(m)]
    for k in q:
        print(bisect_left(arr, k) + 1)

if __name__ == "__main__":
    main()

