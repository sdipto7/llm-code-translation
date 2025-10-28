import math

n = int(input())
arr = list(map(float, input().split()))
sum_before = sum(arr)
non_int = 0
sum_floor = 0.0

for num in arr:
    floor_num = math.floor(num)
    if num != floor_num:
        non_int += 1
    sum_floor += floor_num

max_sum = sum_floor + min(n, non_int)
min_sum = sum_floor + max(0, non_int - n)

if min_sum > sum_before:
    ans = min_sum - sum_before
elif max_sum < sum_before:
    ans = sum_before - max_sum
else:
    x = sum_before - math.floor(sum_before)
    ans = min(1 - x, x)

print("{0:.3f}".format(ans))
