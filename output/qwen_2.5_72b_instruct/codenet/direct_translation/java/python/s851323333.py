import sys
from collections import deque

list = deque()
for line in sys.stdin:
    a = int(line.strip())
    if a == 0:
        print(list.popleft())
    else:
        list.appendleft(a)
