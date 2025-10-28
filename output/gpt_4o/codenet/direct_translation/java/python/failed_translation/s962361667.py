
w, n = map(int, input().split())
values = list(range(1, w + 1))
for _ in range(n):
    a, b = map(int, input().split(','))
    a -= 1
    b -= 1
    values[a], values[b] = values[b], values[a]
for i in range(w):
    print(values[i])

