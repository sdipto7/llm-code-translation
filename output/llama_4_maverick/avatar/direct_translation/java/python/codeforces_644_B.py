
from collections import deque

def main():
    n, b = map(int, input().split())
    ans = [0] * n
    q = deque()
    for i in range(n):
        t, d = map(int, input().split())
        while q and q[0] <= t:
            q.popleft()
        if len(q) <= b:
            ans[i] = (q[-1] if q else t) + d
            q.append(ans[i])
        else:
            ans[i] = -1
    print(*ans)

if __name__ == "__main__":
    main()

