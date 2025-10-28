
import sys
sys.setrecursionlimit(1 << 25)

def main():
    numNode, numEdge = map(int, sys.stdin.readline().split())
    if numEdge % 2 != 0:
        print(-1)
        return
    
    connect = [[] for _ in range(numNode)]
    for _ in range(numEdge):
        a, b = map(int, sys.stdin.readline().split())
        a -= 1
        b -= 1
        connect[a].append(b)
        connect[b].append(a)
    
    visited = [0] * numNode
    odd = [False] * numNode
    print_output = []
    
    def dfs(crt, parent):
        visited[crt] = 1
        for child in connect[crt]:
            if child == parent or visited[child] == 1:
                continue
            elif visited[child] == 2:
                print_output.append(f"{crt+1} {child+1}")
                odd[crt] ^= True
            else:
                dfs(child, crt)
                if odd[child]:
                    print_output.append(f"{child+1} {crt+1}")
                    odd[child] ^= True
                else:
                    print_output.append(f"{crt+1} {child+1}")
                    odd[crt] ^= True
        visited[crt] = 2
    
    dfs(0, -1)
    print('\n'.join(print_output))

if __name__ == "__main__":
    main()

