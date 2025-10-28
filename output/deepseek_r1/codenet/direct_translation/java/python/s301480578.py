n = int(input())
h = list(map(int, input().split()))
max_count = 0
l = 0
while l < n - 1:
    current = 0
    while l < n - 1 and h[l] >= h[l + 1]:
        current += 1
        l += 1
    max_count = max(max_count, current)
    l += 1
print(max_count)
