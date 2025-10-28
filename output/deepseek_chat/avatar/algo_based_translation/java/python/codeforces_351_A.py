
import sys
import math

def main():
    n = int(sys.stdin.readline().strip())
    data = sys.stdin.readline().split()
    arr = [0.0] * (2 * n)
    non_int = 0
    sum_before = 0.0
    total_sum = 0.0
    
    for i in range(2 * n):
        num = float(data[i])
        sum_before += num
        if num != math.floor(num):
            non_int += 1
        total_sum += math.floor(num)
        arr[i] = num
    
    max_sum = min(n, non_int) + total_sum
    min_sum = max(0, non_int - n) + total_sum
    
    if min_sum > sum_before:
        ans = min_sum - sum_before
    elif max_sum < sum_before:
        ans = sum_before - max_sum
    else:
        x = sum_before - math.floor(sum_before)
        ans = min(1.0 - x, x)
    
    print("{:.3f}".format(ans))

if __name__ == "__main__":
    main()

