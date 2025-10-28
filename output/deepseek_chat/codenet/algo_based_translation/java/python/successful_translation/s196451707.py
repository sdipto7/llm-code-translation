
from collections import deque
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    index = 1
    
    g = [[0] * (n+1) for _ in range(n+1)]
    
    for i in range(n):
        u = int(data[index]); index += 1
        k = int(data[index]); index += 1
        for j in range(k):
            v = int(data[index]); index += 1
            g[u][v] = 1
    
    d = [-1] * (n+1)
    
    que = deque()
    que.append(1)
    d[1] = 0
    
    while que:
        top = que.popleft()
        for j in range(1, n+1):
            if g[top][j] == 1 and d[j] == -1:
                que.append(j)
                d[j] = d[top] + 1
    
    for i in range(1, n+1):
        print(f"{i} {d[i]}")

if __name__ == "__main__":
    main()

