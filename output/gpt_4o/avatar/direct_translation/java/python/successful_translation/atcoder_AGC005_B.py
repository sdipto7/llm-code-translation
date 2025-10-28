
from collections import deque

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    a = list(map(int, data[1:N+1]))
    
    leftl = [0] * N
    rightl = [0] * N
    que = deque()
    index = 0
    
    while index < N:
        while que and a[que[0]] > a[index]:
            ind = que.popleft()
            rightl[ind] = index - ind - 1
        que.appendleft(index)
        index += 1
        
    while que:
        ind = que.popleft()
        rightl[ind] = N - ind - 1
    
    index = N - 1
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
    for i in range(N):
        ans += a[i] * (leftl[i] + 1) * (rightl[i] + 1)
    
    print(ans)

main()

