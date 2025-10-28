
import sys
from itertools import combinations

a = []
b = []
c = []
d = []
n = 0
m = 0
q = 0
ans = -100

def main():
    global n, m, q, a, b, c, d, ans
    n, m, q = map(int, sys.stdin.readline().split())
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    for i in range(q):
        a[i], b[i], c[i], d[i] = map(int, sys.stdin.readline().split())
        a[i] -= 1
        b[i] -= 1
    dfs([])
    print(ans)

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

if __name__ == "__main__":
    main()

