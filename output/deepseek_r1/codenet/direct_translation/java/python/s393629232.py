
n = int(input())
arr = list(map(int, input().split()))
minv = arr[0]
maxv = -float('inf')
for i in range(1, n):
    ri = arr[i]
    current_diff = ri - minv
    if current_diff > maxv:
        maxv = current_diff
    if ri < minv:
        minv = ri
print(maxv)

