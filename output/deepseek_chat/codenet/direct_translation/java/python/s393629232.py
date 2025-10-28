
n = int(input())
minv = int(input())
maxv = -float('inf')
for _ in range(1, n):
    ri = int(input())
    maxv = max(maxv, ri - minv)
    minv = min(minv, ri)
print(maxv)

