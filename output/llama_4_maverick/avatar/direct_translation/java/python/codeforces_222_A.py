
n, k = map(int, input().split())
l = 0
c = 1
for a in map(int, input().split()):
    if a == l:
        c += 1
    else:
        c = 1
    l = a
print(n - c if c + k > n else -1)

