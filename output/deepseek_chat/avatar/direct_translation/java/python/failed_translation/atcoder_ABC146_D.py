
n = 0
g = []
ans = []
def main():
    global n, g, ans
    n = int(input())
    g = [[] for _ in range(n)]
    for _ in range(n - 1):
        a = int(input()) - 1
        b = int(input()) - 1
        g[a].append({'id': _, 'to': b})
        g[b].append({'id': _, 'to': a})
    ans = [0] * (n - 1)
    dfs(0, -1, -1)
    print(max(ans))
    for c in ans:
        print(c)
def dfs(to, color, parent):
    global ans
    k = 1
    for e in g[to]:
        if e['to'] == parent:
            continue
        if k == color:
            k += 1
        ans[e['id']] = k
        dfs(e['to'], k, to)
        k += 1
if __name__ == '__main__':
    main()

