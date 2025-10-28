N, X = map(int, input().split())
m = [int(input()) for _ in range(N)]
X -= m[0]
min_val = m[0]
for num in m[1:]:
    X -= num
    if num < min_val:
        min_val = num
print(N + X // min_val)
