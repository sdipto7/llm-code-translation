
Q, H, S, D, N = map(int, input().split())
one_price = min(Q * 4, H * 2, S)
if one_price <= D / 2:
    total = N * one_price
else:
    total = (N // 2) * D + (N % 2) * one_price
print(total)

