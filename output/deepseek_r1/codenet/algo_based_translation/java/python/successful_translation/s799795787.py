
import sys

n = int(sys.stdin.readline())
array = [sys.stdin.readline().strip() for _ in range(n)]
array.sort()

if not array:
    print(0)
else:
    cnt = 1
    a = array[0]
    for element in array:
        if element != a:
            cnt += 1
        a = element
    print(cnt)

