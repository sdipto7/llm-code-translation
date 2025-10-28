
n = int(input())
nums = list(map(int, input().split()))

min_val = float('inf')
count_neg = 0
total = 0

for num in nums:
    abs_num = abs(num)
    total += abs_num
    if abs_num < min_val:
        min_val = abs_num
    if num < 0:
        count_neg += 1

print(total if count_neg % 2 == 0 else total - 2 * min_val)

