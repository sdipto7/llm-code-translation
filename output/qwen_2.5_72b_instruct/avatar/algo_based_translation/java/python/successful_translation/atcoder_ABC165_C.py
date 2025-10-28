
from itertools import permutations

def dfs(current, index):
    global ans
    if len(current) == n:
        score = 0
        for i in range(q):
            if current[b[i]] - current[a[i]] == c[i]:
                score += d[i]
        ans = max(ans, score)
        return
    if current:
        for num in range(current[-1], m + 1):
            dfs(current + [num], index + 1)
    else:
        for num in range(1, m + 1):
            dfs([num], index + 1)

if __name__ == "__main__":
    import sys
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    m = int(data[1])
    q = int(data[2])
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    index = 3
    for i in range(q):
        a[i] = int(data[index]) - 1
        b[i] = int(data[index + 1]) - 1
        c[i] = int(data[index + 2])
        d[i] = int(data[index + 3])
        index += 4
    ans = -100
    dfs([], 0)
    print(ans)

