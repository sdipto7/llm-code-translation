nums = [0] * 11
for i in range(10):
    nums[i] = int(input())
for a in range(9, -1, -1):
    for b in range(a):
        if nums[b] < nums[b+1]:
            nums[10] = nums[b]
            nums[b] = nums[b+1]
            nums[b+1] = nums[10]
print(nums[0])
print(nums[1])
print(nums[2])
