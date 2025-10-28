
import sys
import math

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    arr = [float(data[i + 1]) for i in range(2 * n)]
    
    non_int = 0
    sum_before = 0
    sum_floored = 0
    
    for num in arr:
        sum_before += num
        if num != math.floor(num):
            non_int += 1
        sum_floored += math.floor(num)
    
    max_sum = min(n, non_int) + sum_floored
    min_sum = max(0, non_int - n) + sum_floored
    
    if min_sum > sum_before:
        ans = min_sum - sum_before
    elif max_sum < sum_before:
        ans = sum_before - max_sum
    else:
        x = sum_before - math.floor(sum_before)
        ans = min(1 - x, x)
    
    print(f"{ans:.3f}")

if __name__ == "__main__":
    main()

