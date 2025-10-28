
n = int(input())
a = []
b = []
left = float('inf')
right = 0
for _ in range(n):
    x = int(input())
    y = int(input())
    a.append(x)
    b.append(y)
    left = min(left, x)
    right = max(right, y)
for i in range(n):
    if left == a[i] and right == b[i]:
        print(i + 1)
        exit()
print(-1)

