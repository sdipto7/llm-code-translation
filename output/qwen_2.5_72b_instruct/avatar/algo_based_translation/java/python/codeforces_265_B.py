
import sys

def main():
    import sys
    import math
    input = sys.stdin.read().split()
    n = int(input[0])
    arr = list(map(int, input[1:n+1]))
    ans = arr[0] + 1
    for i in range(1, n):
        ans += abs(arr[i] - arr[i - 1]) + 2
    print(ans)

if __name__ == "__main__":
    main()

