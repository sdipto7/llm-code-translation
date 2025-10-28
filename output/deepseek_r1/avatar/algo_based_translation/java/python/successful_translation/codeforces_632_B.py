
n = int(input())
a = list(map(int, input().split()))
s = input().strip()
total = 0
for i in range(n):
    if s[i] == 'B':
        total += a[i]
ans = total
current = total
for i in range(n):
    if s[i] == 'A':
        current += a[i]
    else:
        current -= a[i]
    if current > ans:
        ans = current
current = total
for i in reversed(range(n)):
    if s[i] == 'A':
        current += a[i]
    else:
        current -= a[i]
    if current > ans:
        ans = current
print(ans)

