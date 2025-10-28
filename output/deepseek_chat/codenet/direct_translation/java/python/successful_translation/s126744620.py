
n, k = map(int, input().split())
a = list(map(int, input().split()))
x = [0] * 200010
for num in a:
    x[num - 1] += 1
x.sort()
ans = sum(x[:200010 - k])
print(ans)

