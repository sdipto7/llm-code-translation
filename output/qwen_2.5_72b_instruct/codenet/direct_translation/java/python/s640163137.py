
import sys

n = int(input())
a = list(map(int, input().split()))

swap_count = 0

for i in range(n):
    mini = i
    for j in range(i, n):
        if a[j] < a[mini]:
            mini = j
    if mini != i:
        a[mini], a[i] = a[i], a[mini]
        swap_count += 1

print(" ".join(map(str, a)))
print(swap_count)

