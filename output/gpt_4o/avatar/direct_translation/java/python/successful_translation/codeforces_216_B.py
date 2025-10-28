
class Codeforces216B:
    def __init__(self):
        self.count = 0
        self.seen = []
        self.path = 0
        self.cycle = 1
        self.graph = []

    def dfs(self, child, par):
        if self.seen[child]:
            return self.cycle
        self.seen[child] = True
        for i in self.graph[child]:
            if i != par:
                self.count += 1
                if self.dfs(i, child) == self.cycle:
                    return self.cycle
        return self.path

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    
    m = int(data[0])
    n = int(data[1])
    
    ft = Codeforces216B()
    ft.graph = [[] for _ in range(m + 1)]
    ft.seen = [False] * (m + 1)
    
    index = 2
    for _ in range(n):
        x = int(data[index])
        y = int(data[index + 1])
        ft.graph[x].append(y)
        ft.graph[y].append(x)
        index += 2
        
    toremove = 0
    for i in range(1, m + 1):
        if not ft.seen[i]:
            ft.count = 0
            if ft.dfs(i, 0) == ft.cycle:
                if ft.count % 2 == 1:
                    toremove += 1
    
    if (m - toremove) % 2 == 1:
        toremove += 1
    
    print(toremove)

