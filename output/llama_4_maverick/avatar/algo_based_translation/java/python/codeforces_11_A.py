n, d = map(int, input().split())
nums = list(map(int, input().split()))
result = 0
for i in range(1, n):
    a = nums[i - 1] - nums[i]
    if a >= 0:
        increment = a // d + 1
        result += increment
        nums[i] += increment * d
print(result)
