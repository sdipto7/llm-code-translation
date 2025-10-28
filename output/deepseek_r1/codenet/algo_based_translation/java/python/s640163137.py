
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))[:n]
swap_count = 0

for i in range(len(a)):
    mini = i
    for j in range(i, len(a)):
        if a[j] < a[mini]:
            mini = j
    if mini != i:
        a[i], a[mini] = a[mini], a[i]
        swap_count += 1

print(' '.join(map(str, a)))
print(swap_count)

