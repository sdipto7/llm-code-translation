
n = int(input())
a = list(map(int, input().split()))

dp1 = [0] * n
current1 = 0
cost1 = 0
for i in range(n):
    cost1 += abs(a[i] - current1)
    current1 = a[i]
    dp1[i] = cost1

dp2 = [0] * n
current2 = 0
cost2 = 0
for j in reversed(range(n)):
    cost2 += abs(a[j] - current2)
    current2 = a[j]
    dp2[j] = cost2

for i in range(n):
    if i == 0:
        print(dp2[i + 1] + abs(a[1]))
    elif i == n - 1:
        print(dp1[i - 1] + abs(a[i - 1]))
    else:
        print(dp1[i - 1] + dp2[i + 1] + abs(a[i - 1] - a[i + 1]))

