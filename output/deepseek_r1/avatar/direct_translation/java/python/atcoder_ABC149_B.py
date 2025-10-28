A, B, K = map(int, input().split())
x = A - K
if x < 0:
    y = B + x
    x = 0
    if y < 0:
        y = 0
else:
    y = B
print(x, y)
