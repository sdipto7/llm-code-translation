
nums = [int(input()) for _ in range(10)]
for a in range(9, -1, -1):
    for b in range(a):
        if nums[b] < nums[b + 1]:
            nums[b], nums[b + 1] = nums[b + 1], nums[b]
print(nums[0])
print(nums[1])
print(nums[2])

