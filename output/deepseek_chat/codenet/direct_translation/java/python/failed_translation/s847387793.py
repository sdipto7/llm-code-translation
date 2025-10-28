
import sys

class Solver:
    def __init__(self):
        self.max = 0

    def run(self):
        n = int(sys.stdin.readline())
        m = int(sys.stdin.readline())
        q = int(sys.stdin.readline())
        a = []
        b = []
        c = []
        d = []
        for _ in range(q):
            a.append(int(sys.stdin.readline()))
            b.append(int(sys.stdin.readline()))
            c.append(int(sys.stdin.readline()))
            d.append(int(sys.stdin.readline()))
        self.dfs([1], n, m, a, b, c, d)
        print(self.max)

    def dfs(self, array, n, m, a, b, c, d):
        if len(array) > n:
            score = 0
            for i in range(len(a)):
                if array[b[i]] - array[a[i]] == c[i]:
                    score += d[i]
            self.max = max(self.max, score)
            return

        new_array = array.copy()
        new_array.append(array[-1])
        while new_array[-1] <= m:
            self.dfs(new_array, n, m, a, b, c, d)
            new_array[-1] += 1

if __name__ == "__main__":
    solver = Solver()
    solver.run()

