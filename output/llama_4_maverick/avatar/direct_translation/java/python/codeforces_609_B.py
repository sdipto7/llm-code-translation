
import sys
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
gen = [0] * 11
for i in arr:
    gen[i] += 1
ans = sum(gen[i] * gen[j] for i in range(1, m + 1) for j in range(1, m + 1) if i != j)
print(ans // 2)

