a, b = map(int, input().split())
sum_val = 0
for _ in range(2):
    if a >= b:
        sum_val += a
        a -= 1
    else:
        sum_val += b
        b -= 1
print(sum_val)
