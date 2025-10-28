n, m = map(int, input().split())
if n % m == 0:
    a = [n // m] * m
else:
    sub = n // m
    remainder = n % m
    a = [sub] * m
    for i in range(remainder):
        a[i] += 1
print(' '.join(map(str, a[::-1])))
