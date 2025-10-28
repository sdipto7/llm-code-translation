w, n = map(int, input().split())
values = [i + 1 for i in range(w)]
for _ in range(n):
    a, b = map(int, input().split(','))
    a -= 1
    b -= 1
    values[a], values[b] = values[b], values[a]
for num in values:
    print(num)
