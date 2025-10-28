
import sys

N = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().split()))
a.sort()
ans = 0
if N == 1 and a[0] > 1:
    ans = 1
else:
    j = 0
    while j < N:
        tmp = 1
        i = j + 1
        while i < N and a[j] == a[i]:
            tmp += 1
            i += 1
        if tmp > a[j]:
            ans += tmp - a[j]
        else:
            ans += tmp
        j = i
print(ans)

