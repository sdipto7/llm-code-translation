
def dfs(lst, ans, n, m, q, a, b, c, d):
    if len(lst) == n:
        score = sum(d[i] for i in range(q) if lst[b[i]] - lst[a[i]] == c[i])
        return max(ans, score)
    if lst:
        last_num = lst[-1]
        for num in range(last_num, m + 1):
            lst.append(num)
            ans = dfs(lst, ans, n, m, q, a, b, c, d)
            lst.pop()
    else:
        for num in range(1, m + 1):
            lst.append(num)
            ans = dfs(lst, ans, n, m, q, a, b, c, d)
            lst.pop()
    return ans

def main():
    n, m, q = map(int, input().split())
    a, b, c, d = [], [], [], []
    for _ in range(q):
        ai, bi, ci, di = map(int, input().split())
        a.append(ai - 1)
        b.append(bi - 1)
        c.append(ci)
        d.append(di)
    ans = dfs([], -100, n, m, q, a, b, c, d)
    print(ans)

if __name__ == "__main__":
    main()

