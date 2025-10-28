
n = int(input())
a = list(map(int, input().split()))
s = input()
total = 0
for i in range(len(s)):
    if s[i] == 'B':
        total += a[i]
ans = total
sum1 = total
for i in range(len(s)):
    if s[i] == 'A':
        sum1 += a[i]
    else:
        sum1 -= a[i]
    ans = max(ans, sum1)
sum1 = total
for i in range(len(s) - 1, -1, -1):
    if s[i] == 'A':
        sum1 += a[i]
    else:
        sum1 -= a[i]
    ans = max(ans, sum1)
print(ans)

