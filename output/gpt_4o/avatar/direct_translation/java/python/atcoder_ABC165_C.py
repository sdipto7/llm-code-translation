
a = None
b = None
c = None
d = None
n = 0
m = 0
q = 0
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
    if lst:
        for num in range(lst[-1], m + 1):
            lst.append(num)
            dfs(lst)
            lst.pop()
    else:
        for num in range(1, m + 1):
            lst.append(num)
            dfs(lst)
            lst.pop()

if __name__ == '__main__':
    import sys
    input = sys.stdin.read
    data = input().split()
    idx = 0
    n = int(data[idx])
    idx += 1
    m = int(data[idx])
    idx += 1
    q = int(data[idx])
    idx += 1
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    for i in range(q):
        a[i] = int(data[idx]) - 1
        idx += 1
        b[i] = int(data[idx]) - 1
        idx += 1
        c[i] = int(data[idx])
        idx += 1
        d[i] = int(data[idx])
        idx += 1
    dfs([])
    print(ans)

