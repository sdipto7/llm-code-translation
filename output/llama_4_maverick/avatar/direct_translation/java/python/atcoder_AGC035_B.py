
import sys
sys.setrecursionlimit(10 ** 6)

def dfs(crt, parent):
    global connect, visited, odd, print_str
    visited[crt] = 1
    for child in connect[crt]:
        if child == parent or visited[child] == 1:
            continue
        elif visited[child] == 2:
            print_str += str(crt + 1) + " " + str(child + 1) + "\n"
            odd[crt] = not odd[crt]
        else:
            dfs(child, crt)
            if odd[child]:
                print_str += str(child + 1) + " " + str(crt + 1) + "\n"
                odd[child] = not odd[child]
            else:
                print_str += str(crt + 1) + " " + str(child + 1) + "\n"
                odd[crt] = not odd[crt]
    visited[crt] = 2

def main():
    global connect, visited, odd, print_str
    num_node, num_edge = map(int, input().split())
    connect = [[] for _ in range(num_node)]
    for _ in range(num_edge):
        a, b = map(int, input().split())
        a -= 1
        b -= 1
        connect[a].append(b)
        connect[b].append(a)

    if num_edge % 2 != 0:
        print(-1)
        return

    visited = [0] * num_node
    odd = [False] * num_node
    print_str = ""
    dfs(0, -1)
    print(print_str, end='')

if __name__ == "__main__":
    main()

