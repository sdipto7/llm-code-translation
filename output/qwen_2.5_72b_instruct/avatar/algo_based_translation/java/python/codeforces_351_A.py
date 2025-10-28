import sys
from math import floor

def main():
    import sys
    from math import floor
    import sys
    from math import floor
    n = int(input().strip())
    arr = list(map(float, input().strip().split()))
    non_int = 0
    sum_before = 0
    sum_val = 0
    for num in arr:
        sum_before += num
        if num != floor(num):
            non_int += 1
        sum_val += floor(num)
    max_sum = min(n, non_int) + sum_val
    min_sum = max(0, non_int - n) + sum_val
    if min_sum > sum_before:
        ans = min_sum - sum_before
    elif max_sum < sum_before:
        ans = sum_before - max_sum
    else:
        x = sum_before - floor(sum_before)
        ans = min(1 - x, x)
    print(f"{ans:.3f}")

if __name__ == "__main__":
    main()
