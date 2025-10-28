
N, X = map(int, input().split())
m = [int(input())]
X -= m[0]
min_value = m[0]
for _ in range(1, N):
    num = int(input())
    m.append(num)
    X -= num
    if num < min_value:
        min_value = num
print(N + X // min_value)

