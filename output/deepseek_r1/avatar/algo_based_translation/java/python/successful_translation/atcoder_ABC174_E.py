
import sys

def solve():
    n, k = map(int, sys.stdin.readline().split())
    logs_length = list(map(int, sys.stdin.readline().split()))
    min_val = 1
    max_val = 10**9 + 1000

    while min_val < max_val:
        mid = (min_val + max_val) // 2
        required_cuts = 0
        for log in logs_length:
            required_cuts += (log + mid - 1) // mid - 1
            if required_cuts > k:
                break
        if required_cuts <= k:
            max_val = mid
        else:
            min_val = mid + 1
    print(min_val)

if __name__ == "__main__":
    solve()

