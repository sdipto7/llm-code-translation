
data = list(map(int, input().split()))
n, m = data[0], data[1]
req = data[2:2 + n]
pre = data[2 + n:2 + n + m]
i, j, ans = n - 1, m - 1, 0
while i >= 0 and j >= 0:
    if req[i] > pre[j]:
        ans += 1
    else:
        j -= 1
    i -= 1
print(ans + i + 1)

