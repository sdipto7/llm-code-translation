
a = int(input())
ar = list(map(int, input().split()))
for i in range(a):
    max_diff = max(ar[i] - ar[0], ar[-1] - ar[i])
    if i == 0:
        min_diff = ar[i + 1] - ar[i]
    elif i == a - 1:
        min_diff = ar[i] - ar[i - 1]
    else:
        min_diff = min(ar[i] - ar[i - 1], ar[i + 1] - ar[i])
    print(min_diff, max_diff)

