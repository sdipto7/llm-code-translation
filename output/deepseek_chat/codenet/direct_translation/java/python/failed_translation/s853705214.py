
n = int(input())
nums = [int(input()) for _ in range(n)]

min_abs = float('inf')
count_negatives = 0
total_sum = 0

for num in nums:
    abs_num = abs(num)
    total_sum += abs_num
    min_abs = min(min_abs, abs_num)
    if num < 0:
        count_negatives += 1

print(total_sum if count_negatives % 2 == 0 else total_sum - (min_abs * 2))

