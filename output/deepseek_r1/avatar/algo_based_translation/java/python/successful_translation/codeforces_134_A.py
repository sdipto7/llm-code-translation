
import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
sum_total = sum(arr)
c = 0
sb = []

for i in range(n):
    current = arr[i]
    remainder = (sum_total - current) % (n - 1) if n != 1 else 1
    quotient = (sum_total - current) // (n - 1) if n != 1 else 0
    if (n == 1 and current == sum_total) or (remainder == 0 and quotient == current):
        c += 1
        sb.append(str(i + 1))

print(c)
print(' '.join(sb))

