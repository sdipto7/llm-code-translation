
n = int(input())
a = list(map(int, input().split()))
count = 0
min_val = float('inf')
total = 0
for num in a:
    if num < 0:
        count += 1
    abs_num = abs(num)
    if abs_num < min_val:
        min_val = abs_num
    total += abs_num
if count % 2 == 0:
    print(total)
else:
    print(total - 2 * min_val)

