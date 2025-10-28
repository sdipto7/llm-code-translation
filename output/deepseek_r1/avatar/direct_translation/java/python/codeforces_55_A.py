n = int(input())
a = [0] * n
i = 0
for k in range(n + 1):
    i = (i + k) % n
    a[i] += 1
print("YES" if all(a) else "NO")
