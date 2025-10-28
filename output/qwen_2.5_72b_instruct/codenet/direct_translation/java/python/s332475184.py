import sys
from collections import deque

class FastScanner:
    def __init__(self):
        self.buffer = deque(sys.stdin.read().split())
    
    def next(self):
        return self.buffer.popleft()
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class Main:
    @staticmethod
    def main():
        fs = FastScanner()
        n = fs.nextInt()
        q = fs.nextInt()
        graph = [[] for _ in range(n)]
        counter = [0] * n
        
        for _ in range(n - 1):
            a = fs.nextInt() - 1
            b = fs.nextInt() - 1
            graph[a].append(b)
            graph[b].append(a)
        
        for _ in range(q):
            counter[fs.nextInt() - 1] += fs.nextInt()
        
        Main.dfs(0, -1, 0, graph, counter)
        print(' '.join(map(str, counter)))
    
    @staticmethod
    def dfs(v, par, val, graph, counter):
        for i in graph[v]:
            if i != par:
                Main.dfs(i, v, val + counter[v], graph, counter)
        counter[v] += val

if __name__ == "__main__":
    Main.main()
