
import sys
from typing import List

a = []
b = []
c = []
d = []
n = 0
m = 0
q = 0
ans = -100

def main():
    global a, b, c, d, n, m, q, ans
    data = sys.stdin.read().split()
    index = 0
    n = int(data[index]); index += 1
    m = int(data[index]); index += 1
    q = int(data[index]); index += 1
    
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    
    for i in range(q):
        a[i] = int(data[index]) - 1; index += 1
        b[i] = int(data[index]) - 1; index += 1
        c[i] = int(data[index]); index += 1
        d[i] = int(data[index]); index += 1
    
    dfs([])
    print(ans)

def dfs(lst: List[int]):
    global ans
    if len(lst) == n:
        score = 0
        for i in range(q):
            if lst[b[i]] - lst[a[i]] == c[i]:
                score += d[i]
        ans = max(ans, score)
        return
    
    if lst:
        start_num = lst[-1]
        for num in range(start_num, m + 1):
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

