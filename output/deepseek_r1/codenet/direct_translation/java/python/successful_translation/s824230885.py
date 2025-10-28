n = int(input())
lst = list(map(int, input().split()))
max_val = 0
count = 0
for num in lst:
    if num >= max_val:
        max_val = num
        count += 1
print(count)
