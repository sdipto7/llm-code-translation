
import sys
from collections import defaultdict

input = sys.stdin.read
data = input().split()

numNode = int(data[0])
numEdge = int(data[1])
connect = defaultdict(list)
idx = 2
for _ in range(numEdge):
    a = int(data[idx]) - 1
    b = int(data[idx + 1]) - 1
    connect[a].append(b)
    connect[b].append(a)
    idx += 2

if numEdge % 2 != 0:
    print(-1)
    exit()

visited = [0] * numNode
odd = [False] * numNode
print = []

def dfs(crt, parent):
    visited[crt] = 1
    crtConnect = connect[crt]
    for child in crtConnect:
        if child == parent or visited[child] == 1:
            continue
        elif visited[child] == 2:
            print.append(f"{crt + 1} {child + 1}")
            odd[crt] = not odd[crt]
        else:
            dfs(child, crt)
            if odd[child]:
                print.append(f"{child + 1} {crt + 1}")
                odd[child] = not odd[child]
            else:
                print.append(f"{crt + 1} {child + 1}")
                odd[crt] = not odd[crt]
    visited[crt] = 2

dfs(0, -1)
print("\n".join(print))

