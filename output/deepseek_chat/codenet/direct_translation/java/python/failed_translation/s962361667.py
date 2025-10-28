
w, n = map(int, input().split())
values = [i + 1 for i in range(w)]
for _ in range(n):
    str_input = input()
    ab = str_input.split(',')
    a = int(ab[0]) - 1
    b = int(ab[1]) - 1
    values[a], values[b] = values[b], values[a]
for i in range(w):
    print(values[i])

