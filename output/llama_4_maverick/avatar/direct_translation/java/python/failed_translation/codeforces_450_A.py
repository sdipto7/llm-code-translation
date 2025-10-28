
from collections import deque

n, m = map(int, input().split())
q1 = deque()
q2 = deque()
for i in range(1, n + 1):
    q1.append(int(input().split()
