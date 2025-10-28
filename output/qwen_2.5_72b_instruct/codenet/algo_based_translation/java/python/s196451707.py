
import queue

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    index += 1

    g = [[0] * (n + 1) for _ in range(n + 1)]

    for i in range(n):
        u = int(data[index])
        index += 1
        k = int(data[index])
        index += 1
        for j in range(k):
            v = int(data[index])
            index += 1
            g[u][v] = 1

    d = [-1] * (n + 1)
    que = queue.Queue()
    que.put(1)
    d[1] = 0

    while not que.empty():
        top = que.get()
        for j in range(1, n + 1):
            if g[top][j] == 1 and d[j] == -1:
                que.put(j)
                d[j] = d[top] + 1

    for i in range(1, n + 1):
        print(i, d[i])

if __name__ == "__main__":
    main()

