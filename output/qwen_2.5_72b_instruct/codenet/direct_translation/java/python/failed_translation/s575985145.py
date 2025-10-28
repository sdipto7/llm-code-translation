import sys

size = int(input())
graph = [[0] * size for _ in range(size)]

for _ in range(size):
    id = int(input()) - 1
    cols = int(input())
    row = [0] * size
    for _ in range(cols):
        row[int(input()) - 1] = 1
    graph[id] = row

for i in range(size):
    print(" ".join(map(str, graph[i])))
