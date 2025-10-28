
import sys
from collections import deque

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    b = int(data[1])
    
    ans = [-1] * n
    q = deque()
    
    index = 2
    for i in range(n):
        t = int(data[index])
        d = int(data[index + 1])
        index += 2
        
        while q and q[0] <= t:
            q.popleft()
        
        if len(q) <= b:
            if not q:
                ans[i] = t + d
            else:
                ans[i] = q[-1] + d
            q.append(ans[i])
        else:
            ans[i] = -1
    
    print(" ".join(map(str, ans)))

if __name__ == "__main__":
    main()

