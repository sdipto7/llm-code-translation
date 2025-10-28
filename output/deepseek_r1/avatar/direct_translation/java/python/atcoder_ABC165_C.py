
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

ans = -float('inf')

def dfs(current):
    global ans
    if len(current) == n:
        score = 0
        for i in range(q):
            if current[b[i]] - current[a[i]] == c[i]:
                score += d[i]
        if score > ans:
            ans = score
        return
    start = current[-1] if current else 1
    for num in range(start, m + 1):
        current.append(num)
        dfs(current)
        current.pop()

dfs([])
print(ans)

