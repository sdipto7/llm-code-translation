
n, m = map(int, input().split())
arr = list(map(int, input().split()))
gen = [0] * 11
for x in arr:
    gen[x] += 1
ans = 0
for i in range(1, m + 1):
    for k in range(1, m + 1):
        if i != k:
            ans += gen[i] * gen[k]
print(ans // 2)

