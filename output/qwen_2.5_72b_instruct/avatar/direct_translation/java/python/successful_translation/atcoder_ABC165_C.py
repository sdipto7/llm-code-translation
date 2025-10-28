
import sys

a = None
b = None
c = None
d = None
n = 0
m = 0
q = 0
ans = -100

def main():
    import sys
    input = sys.stdin.read().split()
    global n, m, q, a, b, c, d
    n = int(input[0])
    m = int(input[1])
    q = int(input[2])
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    idx = 3
    for i in range(q):
        a[i] = int(input[idx]) - 1
        b[i] = int(input[idx + 1]) - 1
        c[i] = int(input[idx + 2])
        d[i] = int(input[idx + 3])
        idx += 4
    dfs([])

def dfs(lst):
    global ans
    if len(lst) == n:
        score = 0
        for i in range(q):
            score += d[i] if lst[b[i]] - lst[a[i]] == c[i] else 0
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

if __name__ == "__main__":
    main()
    print(ans)

