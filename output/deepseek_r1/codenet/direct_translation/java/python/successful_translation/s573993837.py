
n, m = map(int, input().split())
r = n % m
print(min(r, m - r))

