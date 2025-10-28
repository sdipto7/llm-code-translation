
import sys
n = int(sys.stdin.readline().strip())
arr = list(map(int, sys.stdin.readline().split()))
sum_val = sum(arr)
c = 0
sb = []
for i in range(n):
    if (sum_val - arr[i]) % (n - 1) == 0 and (sum_val - arr[i]) // (n - 1) == arr[i]:
        c += 1
        sb.append(str(i + 1))
print(c)
print(' '.join(sb))

