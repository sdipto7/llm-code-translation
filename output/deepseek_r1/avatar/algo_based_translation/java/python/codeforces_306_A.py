
n, m = map(int, input().split())
a = []
if n % m == 0:
    q = n // m
    a = [q] * m
else:
    sub = n // m
    a = [sub] * m
    test = n - sub * m
    count = 0
    for _ in range(test):
        a[count] += 1
        count += 1
        if count >= m:
            count = 0
print(' '.join(map(str, reversed(a))))

