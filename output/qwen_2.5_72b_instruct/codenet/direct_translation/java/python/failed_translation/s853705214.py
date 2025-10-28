
n = int(input())
nums = [int(input()) for _ in range(n)]

min_val = float('inf')
count_negatives = 0
total_sum = 0
for num in nums:
    abs_val = abs(num)
    total_sum += abs_val
    min_val = min(min_val, abs_val)
    if num < 0:
        count_negatives += 1

print(total_sum if count_negatives % 2 == 0 else total_sum - (min_val * 2))

