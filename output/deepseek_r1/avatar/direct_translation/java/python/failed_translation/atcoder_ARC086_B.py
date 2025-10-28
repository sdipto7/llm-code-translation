
n = int(input())
a = list(map(int, input().split()))
m = 0
for i in range(1, n):
    if abs(a[i]) > abs(a[m]):
        m = i
operations = []
for i in range(n):
    if (a[m] >= 0 and a[i] < 0) or (a[m] < 0 and a[i] >= 0):
        operations.append((m + 1, i + 1))
if a[m] >= 0:
    for i in range(1, n):
        operations.append((i, i + 1))
else:
    for i in range(n, 1, -1):
        operations.append((i, i - 1))
print(len(operations))
for op in operations:
    print(op[0], op[1])

