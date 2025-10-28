
import sys
import math

def main():
    br = sys.stdin
    n = int(br.readline())
    st = br.readline().split()
    arr = [0.0] * (2 * n)
    non_int = 0
    sum_before = 0.0
    sum_ = 0.0
    for i in range(2 * n):
        num = float(st[i])
        sum_before += num
        if num != math.floor(num):
            non_int += 1
        sum_ += math.floor(num)
        arr[i] = num
    max_sum = min(n, non_int) + sum_
    min_sum = max(0, non_int - n) + sum_
    if min_sum > sum_before:
        ans = min_sum - sum_before
    elif max_sum < sum_before:
        ans = sum_before - max_sum
    else:
        x = sum_before - math.floor(sum_before)
        ans = min(1 - x, x)
    print("{0:.3f}".format(ans))

if __name__ == "__main__":
    main()

