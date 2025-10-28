
import bisect

n = int(input())
L = list(map(int, input().split()))
L.sort()
count = 0

for i in range(n):
    for j in range(i + 1, n):
        a = L[i]
        b = L[j]
        target = a + b
        k = bisect.bisect_left(L, target, j + 1)
        count += k - (j + 1)

print(count)

