n = int(input())
vec = []
for _ in range(n):
    a, b, c, d = map(int, input().split())
    vec.append((a, b, c, d))

min_price = float('inf')
result = 0

for i in range(n):
    is_candidate = True
    for j in range(n):
        if vec[j][0] > vec[i][0] and vec[j][1] > vec[i][1] and vec[j][2] > vec[i][2]:
            is_candidate = False
            break
    if is_candidate:
        if vec[i][3] < min_price:
            min_price = vec[i][3]
            result = i + 1

print(result)
