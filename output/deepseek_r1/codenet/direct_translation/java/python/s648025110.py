n = int(input())
h = list(map(int, input().split()))

ans = 0
out = 0

for num in h:
    if out < num:
        ans += num - out
        out = num
    else:
        out = num

print(ans)
