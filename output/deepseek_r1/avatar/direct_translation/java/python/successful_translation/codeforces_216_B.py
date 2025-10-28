
class Solver:
    def __init__(self):
        self.count = 0
        self.seen = []
        self.cycle = 1
        self.path = 0
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

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    m = int(input[ptr])
    ptr += 1
    n = int(input[ptr])
    ptr += 1
    solver = Solver()
    solver.graph = [[] for _ in range(m + 1)]
    solver.seen = [False] * (m + 1)
    for _ in range(n):
        x = int(input[ptr])
        ptr += 1
        y = int(input[ptr])
        ptr += 1
        solver.graph[x].append(y)
        solver.graph[y].append(x)
    toremove = 0
    for i in range(1, m + 1):
        if not solver.seen[i]:
            solver.count = 0
            if solver.dfs(i, 0) == solver.cycle:
                if solver.count % 2 == 1:
                    toremove += 1
    if (m - toremove) % 2 == 1:
        toremove += 1
    print(toremove)

if __name__ == "__main__":
    main()

