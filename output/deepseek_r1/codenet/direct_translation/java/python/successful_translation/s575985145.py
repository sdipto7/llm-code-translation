
size = int(input())
graph = [[0] * size for _ in range(size)]

for _ in range(size):
    data = list(map(int, input().split()))
    node_id = data[0]
    cols = data[1]
    neighbors = data[2:2 + cols]
    row = [0] * size
    for n in neighbors:
        row[n - 1] = 1
    graph[node_id - 1] = row

for row in graph:
    print(' '.join(map(str, row)))

