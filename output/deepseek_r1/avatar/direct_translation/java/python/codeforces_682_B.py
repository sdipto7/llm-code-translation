n = int(input())
nums = list(map(int, input().split()))[:n]
nums.sort()
c = 1
for num in nums:
    if num >= c:
        c += 1
print(c)
