
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    nums = data[ptr:ptr + n]
    pre = [0] * (n + 1)
    for i in range(1, n + 1):
        pre[i] = pre[i - 1] + nums[i - 1]
    min_val = float('inf')
    for i in range(1, n):
        val1 = pre[i]
        val2 = pre[n] - pre[i]
        min_val = min(min_val, abs(val1 - val2))
    print(min_val)

if __name__ == "__main__":
    main()

