
size = int(input())
graph = [[0] * size for _ in range(size)]

for _ in range(size):
    id = int(input())
    cols = int(input())
    row = [0] * size
    for _ in range(cols):
        row[int(input()) - 1] = 1
    graph[id - 1] = row

for i in range(len(graph)):
    print(" ".join(map(str, graph[i])))

