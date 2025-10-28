
n = int(input())
h = list(map(int, input().split()))
ans = 0
out = 0
for i in h:
    if out < i:
        ans += i - out
    out = i
print(ans)

