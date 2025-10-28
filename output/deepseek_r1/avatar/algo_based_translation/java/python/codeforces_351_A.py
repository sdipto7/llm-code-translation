
import math

def main():
    n = int(input())
    nums = list(map(float, input().split()))
    sum_before = 0.0
    sum_floor = 0.0
    non_int = 0
    
    for num in nums:
        sum_before += num
        if math.floor(num) != num:
            non_int += 1
        sum_floor += math.floor(num)
    
    max_sum = min(n, non_int) + sum_floor
    min_sum = max(0, non_int - n) + sum_floor
    
    if sum_before < min_sum:
        ans = min_sum - sum_before
    elif sum_before > max_sum:
        ans = sum_before - max_sum
    else:
        x = sum_before - math.floor(sum_before)
        ans = min(1 - x, x)
    
    print(f"{ans:.3f}")

if __name__ == "__main__":
    main()

