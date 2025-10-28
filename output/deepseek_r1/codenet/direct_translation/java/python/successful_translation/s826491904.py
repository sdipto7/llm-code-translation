
n = int(input())
nums = list(map(int, input().split()))[:n]
print(max(nums) - min(nums))

