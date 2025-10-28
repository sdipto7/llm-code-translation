
n, k = map(int, input().split())
l, c = 0, 1
for _ in range(n):
    a = int(input())
    if a == l:
        c += 1
    else:
        c = 1
    l = a
print(n - c if c + k > n else -1)

