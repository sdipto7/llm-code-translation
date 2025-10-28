
import sys
n = int(sys.stdin.readline())
ans = sorted([int(sys.stdin.readline()) for _ in range(n)])
count = ans[-1]
for i in range(n-2, -1, -1):
    if ans[i] < ans[i+1]:
        count += ans[i]
    else:
        while ans[i] >= ans[i+1]:
            ans[i] -= 1
        if ans[i] > 0:
            count += ans[i]
print(count)

