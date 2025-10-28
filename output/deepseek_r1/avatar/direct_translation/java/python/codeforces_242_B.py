n = int(input())
a = []
b = []
for _ in range(n):
    x, y = map(int, input().split())
    a.append(x)
    b.append(y)
left = min(a)
right = max(b)
for i in range(n):
    if a[i] == left and b[i] == right:
        print(i + 1)
        exit()
print(-1)
