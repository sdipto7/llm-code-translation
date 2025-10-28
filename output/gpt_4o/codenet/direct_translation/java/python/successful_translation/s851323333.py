
from collections import deque
import sys

list = deque()

for line in sys.stdin:
    try:
        a = int(line.strip())
        if a == 0:
            print(list.popleft())
        else:
            list.appendleft(a)
    except ValueError:
        break

