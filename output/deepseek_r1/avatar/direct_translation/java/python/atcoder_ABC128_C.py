
n, m = map(int, input().split())
a = [0] * n
for i in range(m):
    parts = list(map(int, input().split()))
    k = parts[0]
    for s in parts[1:]:
        s -= 1
        a[s] |= 1 << i
p = 0
for i in range(m):
    x = int(input())
    p |= x << i
ans = 0
for s in range(1 << n):
    t = 0
    for i in range(n):
        if (s >> i) & 1:
            t ^= a[i]
    if t == p:
        ans += 1
print(ans)

