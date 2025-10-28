
Q, H, S, D, N = map(int, input().split())
onePrice = min(Q * 4, H * 2, S)
if onePrice <= D / 2:
    total_cost = N * onePrice
else:
    total_cost = (N // 2) * D + (N % 2) * onePrice
print(total_cost)

