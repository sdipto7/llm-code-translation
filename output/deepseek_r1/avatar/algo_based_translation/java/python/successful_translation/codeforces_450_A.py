
from collections import deque
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    q1 = deque()
    q2 = deque()
    values = list(map(int, sys.stdin.readline().split()))
    for i in range(1, n+1):
        q1.append(values[i-1])
        q2.append(i)
    ans = 0
    while q1:
        if q1[0] <= m:
            q1.popleft()
            ans = q2.popleft()
        else:
            x = q1.popleft()
            val = x - m
            q1.append(val)
            val2 = q2.popleft()
            q2.append(val2)
    print(ans)

if __name__ == "__main__":
    main()

