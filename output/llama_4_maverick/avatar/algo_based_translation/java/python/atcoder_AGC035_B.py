
def dfs(crt, parent, connect, visited, odd, print):
    visited[crt] = 1
    for child in connect[crt]:
        if child == parent or visited[child] == 1:
            continue
        elif visited[child] == 2:
            print.append(f"{crt + 1} {child + 1}")
            odd[crt] = not odd[crt]
        else:
            dfs(child, crt, connect, visited, odd, print)
            if odd[child]:
                print.append(f"{child + 1} {crt + 1}")
                odd[child] = not odd[child]
            else:
                print.append(f"{crt + 1} {child + 1}")
                odd[crt] = not odd[crt]
    visited[crt] = 2

def main():
    numNode, numEdge = map(int, input().split())
    connect = [[] for _ in range(numNode)]
    for _ in range(numEdge):
        a, b = map(int, input().split())
        a -= 1
        b -= 1
        connect[a].append(b)
        connect[b].append(a)

    if numEdge % 2 != 0:
        print(-1)
        return

    visited = [0] * numNode
    odd = [False] * numNode
    print = []
    dfs(0, -1, connect, visited, odd, print)
    print("\n".join(print))

if __name__ == "__main__":
    main()

