
n = int(input())
h = list(map(int, input().split()))
max_val = 0
l = 0
while l < n - 1:
    count = 0
    while l < n - 1 and h[l] >= h[l + 1]:
        l += 1
        count += 1
    max_val = max(max_val, count)
    l += 1
print(max_val)

