
def dfs(crt, parent):
    global visited, odd, print_result, connect
    visited[crt] = 1
    crtConnect = connect[crt]
    for child in crtConnect:
        if child == parent or visited[child] == 1:
            continue
        elif visited[child] == 2:
            print_result.append(f"{crt + 1} {child + 1}\n")
            odd[crt] = not odd[crt]
        else:
            dfs(child, crt)
            if odd[child]:
                print_result.append(f"{child + 1} {crt + 1}\n")
                odd[child] = not odd[child]
            else:
                print_result.append(f"{crt + 1} {child + 1}\n")
                odd[crt] = not odd[crt]
    visited[crt] = 2

import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.read
data = input().split()
index = 0

numNode = int(data[index])
index += 1
numEdge = int(data[index])
index += 1

connect = [[] for _ in range(numNode)]
for _ in range(numEdge):
    a = int(data[index]) - 1
    index += 1
    b = int(data[index]) - 1
    index += 1
    connect[a].append(b)
    connect[b].append(a)

if numEdge % 2 != 0:
    print(-1)
    exit()

visited = [0] * numNode
odd = [False] * numNode
print_result = []

dfs(0, -1)
print(''.join(print_result))

