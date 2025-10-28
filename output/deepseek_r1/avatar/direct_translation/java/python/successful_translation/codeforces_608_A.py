n, s = map(int, input().split())
max_val = 0
for _ in range(n):
    f, t = map(int, input().split())
    max_val = max(max_val, f + t)
print(max(max_val, s))
