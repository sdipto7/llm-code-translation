
from collections import deque
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    leftl = [0] * n
    rightl = [0] * n

    que = deque()
    index = 0
    while index < n:
        while que and a[que[0]] > a[index]:
            ind = que.popleft()
            rightl[ind] = index - ind - 1
        que.appendleft(index)
        index += 1
    while que:
        ind = que.popleft()
        rightl[ind] = n - ind - 1

    que = deque()
    index = n - 1
    while index >= 0:
        while que and a[que[0]] > a[index]:
            ind = que.popleft()
            leftl[ind] = ind - index - 1
        que.appendleft(index)
        index -= 1
    while que:
        ind = que.popleft()
        leftl[ind] = ind - index - 1

    ans = 0
    for i in range(n):
        ans += a[i] * (leftl[i] + 1) * (rightl[i] + 1)
    print(ans)

if __name__ == "__main__":
    main()

