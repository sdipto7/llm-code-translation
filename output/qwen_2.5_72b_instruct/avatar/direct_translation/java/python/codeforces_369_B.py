
import sys

def getPoints(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            sk -= 1
    while sAll > 0:
        idx = 0
        while sAll > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            sAll -= 1
    return ans

input = sys.stdin.read().split()
n = int(input[0])
k = int(input[1])
l = int(input[2])
r = int(input[3])
sAll = int(input[4])
sk = int(input[5])
ans = getPoints(n, k, l, r, sAll, sk)
print(" ".join(map(str, ans)))

