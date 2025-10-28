
n = int(input())
s = input().strip()
l = list(s)
x = y = t = 0

for i in range(n):
    if l[i] not in {'4', '7'}:
        t = 1

if t == 1:
    print("NO")
else:
    for i in range(n // 2):
        x += int(l[i])
    for i in range(n-1, (n // 2) - 1, -1):
        y += int(l[i])
    print("YES" if x == y else "NO")

