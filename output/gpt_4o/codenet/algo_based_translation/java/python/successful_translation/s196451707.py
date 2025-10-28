
import sys
from collections import deque

def main():
    sc = sys.stdin
    n = int(sc.readline().strip())
    
    g = [[0] * (n + 1) for _ in range(n + 1)]
    
    for _ in range(n):
        u, k, *v_list = map(int, sc.readline().strip().split())
        for v in v_list:
            g[u][v] = 1
    
    d = [-1] * (n + 1)
    que = deque()
    que.append(1)
    d[1] = 0
    
    while que:
        top = que.popleft()
        for j in range(1, n + 1):
            if g[top][j] == 1 and d[j] == -1:
                que.append(j)
                d[j] = d[top] + 1
    
    for i in range(1, n + 1):
        print(i, d[i])

if __name__ == "__main__":
    main()

