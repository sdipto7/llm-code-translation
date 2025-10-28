n = int(input())
total = 0.0
for _ in range(n):
    a, b = input().split()
    val = float(a)
    total += val * (1 if b == 'JPY' else 380000)
print(total)
