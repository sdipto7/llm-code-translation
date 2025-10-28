
n, k = map(int, input().split())
n += 1
z = k - n % k if n % k != 0 else 0
print(n + z)

