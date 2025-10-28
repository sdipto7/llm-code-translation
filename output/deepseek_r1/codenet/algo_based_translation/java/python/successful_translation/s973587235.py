
n = int(input())
nums = list(map(int, input().split()))
min_n = nums[0] - 1
for h in nums[1:]:
    if min_n == h:
        min_n = h
    elif min_n == h - 1:
        min_n = h - 1
    elif min_n < h - 1:
        min_n = h - 1
    elif min_n > h:
        print("No")
        exit()
print("Yes")

