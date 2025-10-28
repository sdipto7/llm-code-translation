
n = int(input())
a = list(map(int, input().split()))
s = input()
sum_value = 0
for i in range(len(s)):
    if s[i] == 'B':
        sum_value += a[i]
ans = sum_value
sum1 = sum_value
for i in range(len(s)):
    if s[i] == 'A':
        sum1 += a[i]
    else:
        sum1 -= a[i]
    ans = max(ans, sum1)
sum1 = sum_value
for i in range(len(s) - 1, -1, -1):
    if s[i] == 'A':
        sum1 += a[i]
    else:
        sum1 -= a[i]
    ans = max(ans, sum1)
print(ans)

