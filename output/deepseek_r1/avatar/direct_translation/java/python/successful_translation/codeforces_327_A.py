n = int(input())
arr = list(map(int, input().split()))
max_val = -float('inf')
for i in range(n):
    for j in range(i, n):
        brr = arr.copy()
        for k in range(i, j + 1):
            brr[k] = 1 - brr[k]
        current = sum(brr)
        if current > max_val:
            max_val = current
if n == 1:
    print(0 if arr[0] == 1 else 1)
else:
    print(max_val)
