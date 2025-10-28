
import sys
input = sys.stdin.readline
x = [0]*3
max_val = 0
for i in range(3):
    x[i] = int(input())
    max_val = max(max_val, x[i])
k = int(input())
a = [[] for _ in range(3)]
for i in range(3):
    for _ in range(x[i]):
        a[i].append(int(input()))
    a[i].sort()
ans = []
for i in range(x[0]+1):
    for j in range(x[1]+1):
        for m in range(x[2]+1):
            if i*j*m <= k and i <= x[0] and j <= x[1] and m <= x[2]:
                tmp = 0
                if i > 0:
                    tmp += a[0][-i]
                if j > 0:
                    tmp += a[1][-j]
                if m > 0:
                    tmp += a[2][-m]
                ans.append(tmp)
ans.sort()
n = len(ans)
for i in range(min(k, n)):
    print(ans[n-i-1])

