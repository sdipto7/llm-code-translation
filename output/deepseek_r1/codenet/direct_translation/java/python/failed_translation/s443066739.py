Here is the Python code translated from the given Java code:


n = int(input())
a = list(map(int, input().split()))
total = sum(a)
current_sum = 0
min_diff = float('inf')

for i in range(n-1):
    current_sum += a[i]
    min_diff = min(min_diff, abs(2 * current_sum - total))

print(min_diff)

