
n = int(input())
array = [int(input()) for _ in range(n)]
max_val = 0
min_val = 10000
for num in array:
    if max_val < num:
        max_val = num
    if min_val > num:
        min_val = num
print(max_val - min_val)

