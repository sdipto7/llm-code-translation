
from collections import defaultdict

def dfs(crt, parent):
    visited[crt] = 1
    crtConnect = connect[crt]
    for child in crtConnect:
        if child == parent or visited[child] == 1:
            continue
        elif visited[child] == 2:
            print.append(f"{crt + 1} {child + 1}\n")
            odd[crt] = not odd[crt]
        else:
            dfs(child, crt)
            if odd[child]:
                print.append(f"{child + 1} {crt + 1}\n")
                odd[child] = not odd[child]
            else:
                print.append(f"{crt + 1} {child + 1}\n")
                odd[crt] = not odd[crt]
    visited[crt] = 2

if __name__ == "__main__":
    import sys
    input = sys.stdin.read().split()
    index = 0
    
    numNode = int(input[index])
    index += 1
    numEdge = int(input[index])
    index += 1
    
    connect = defaultdict(list)
    
    for _ in range(numEdge):
        a = int(input[index]) - 1
        index += 1
        b = int(input[index]) - 1
        index += 1
        connect[a].append(b)
        connect[b].append(a)
    
    if numEdge % 2 != 0:
        print("-1")
    else:
        visited = [0] * numNode
        odd = [False] * numNode
        print = []
        
        dfs(0, -1)
        
        for line in print:
            print(line, end="")

