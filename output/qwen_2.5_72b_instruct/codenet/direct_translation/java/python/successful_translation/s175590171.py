
import sys

def fast_input():
    return sys.stdin.read().split()

data = fast_input()
n = int(data[0])
a = list(map(int, data[1:n+1]))
a.sort()
total_sum = 0
count = 0
for i in range(n-1):
    total_sum += a[i]
    if a[i+1] <= 2 * total_sum:
        count += 1
    else:
        count = 0
print(count + 1)

