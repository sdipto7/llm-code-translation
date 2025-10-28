
import sys
n = int(sys.stdin.readline().strip())
st = sys.stdin.readline().strip().split()
arr = list(map(float, st))
non_int = sum(1 for num in arr if num != int(num))
sum_before = sum(arr)
sum_floor = sum(int(num) for num in arr)
max_sum = min(n, non_int) + sum_floor
min_sum = max(0, non_int - n) + sum_floor
if min_sum > sum_before:
    ans = min_sum - sum_before
elif max_sum < sum_before:
    ans = sum_before - max_sum
else:
    x = sum_before - int(sum_before)
    ans = min(1 - x, x)
print(f"{ans:.3f}")

