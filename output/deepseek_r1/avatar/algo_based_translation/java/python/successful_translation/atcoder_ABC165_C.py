
n, m, q = map(int, input().split())
a = []
b = []
c = []
d = []
for _ in range(q):
    ai, bi, ci, di = map(int, input().split())
    a.append(ai - 1)
    b.append(bi - 1)
    c.append(ci)
    d.append(di)
ans = -100

def dfs(lst):
    global ans
    if len(lst) == n:
        score = 0
        for i in range(q):
            if lst[b[i]] - lst[a[i]] == c[i]:
                score += d[i]
        ans = max(ans, score)
        return
    start = lst[-1] if lst else 1
    for num in range(start, m + 1):
        lst.append(num)
        dfs(lst)
        lst.pop()

dfs([])
print(ans)

