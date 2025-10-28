
from collections import deque

def main():
    import sys
    input = sys.stdin.read().split()
    
    index = 0
    n = int(input[index])
    index += 1
    b = int(input[index])
    index += 1
    
    ans = [0] * n
    q = deque()
    
    for i in range(n):
        t = int(input[index])
        index += 1
        d = int(input[index])
        index += 1
        
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

