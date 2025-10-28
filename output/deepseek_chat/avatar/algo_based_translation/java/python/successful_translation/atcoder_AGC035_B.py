
import sys
sys.setrecursionlimit(300000)

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    numNode = int(data[0])
    numEdge = int(data[1])
    index = 2
    
    connect = [[] for _ in range(numNode)]
    for i in range(numEdge):
        a = int(data[index]) - 1
        b = int(data[index+1]) - 1
        index += 2
        connect[a].append(b)
        connect[b].append(a)
    
    if numEdge % 2 != 0:
        print(-1)
        return
    
    visited = [0] * numNode
    odd = [False] * numNode
    print_lines = []
    
    def dfs(crt, parent):
        visited[crt] = 1
        crtConnect = connect[crt]
        for child in crtConnect:
            if child == parent or visited[child] == 1:
                continue
            elif visited[child] == 2:
                print_lines.append(f"{crt+1} {child+1}")
                odd[crt] = not odd[crt]
            else:
                dfs(child, crt)
                if odd[child]:
                    print_lines.append(f"{child+1} {crt+1}")
                    odd[child] = not odd[child]
                else:
                    print_lines.append(f"{crt+1} {child+1}")
                    odd[crt] = not odd[crt]
        visited[crt] = 2
    
    dfs(0, -1)
    print("\n".join(print_lines))

if __name__ == "__main__":
    main()

