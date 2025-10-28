
import sys
from collections import defaultdict

def main():
    num_node, num_edge = map(int, sys.stdin.readline().split())
    connect = defaultdict(list)
    for _ in range(num_edge):
        a, b = map(int, sys.stdin.readline().split())
        connect[a-1].append(b-1)
        connect[b-1].append(a-1)
    
    if num_edge % 2 != 0:
        print(-1)
        return
    
    visited = [0] * num_node
    odd = [False] * num_node
    print_buffer = []
    
    def dfs(crt, parent):
        visited[crt] = 1
        for child in connect[crt]:
            if child == parent or visited[child] == 1:
                continue
            elif visited[child] == 2:
                print_buffer.append(f"{crt+1} {child+1}")
                odd[crt] = not odd[crt]
            else:
                dfs(child, crt)
                if odd[child]:
                    print_buffer.append(f"{child+1} {crt+1}")
                    odd[child] = not odd[child]
                else:
                    print_buffer.append(f"{crt+1} {child+1}")
                    odd[crt] = not odd[crt]
        visited[crt] = 2
    
    dfs(0, -1)
    print("\n".join(print_buffer))

if __name__ == "__main__":
    main()

