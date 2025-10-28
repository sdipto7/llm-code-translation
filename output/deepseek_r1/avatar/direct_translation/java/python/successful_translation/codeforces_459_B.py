n = int(input())
a = list(map(int, input().split()))
a.sort()
min_val = a[0]
max_val = a[-1]
count_min = a.count(min_val)
count_max = a.count(max_val)
if min_val == max_val:
    print(0, count_min * (count_min - 1) // 2)
else:
    print(max_val - min_val, count_min * count_max)
