
import sys
from collections import deque

class atcoder_AGC004_D:
    def __init__(self):
        self.main()

    def main(self):
        import threading
        threading.Thread(target=self.run).start()

    def run(self):
        import sys
        input = sys.stdin.read().split()
        n = int(input[0])
        k = int(input[1])
        as_ = list(map(lambda x: int(x) - 1, input[2:]))
        print(Calculator(n, k, as_).calculate())

class Calculator:
    def __init__(self, n, k, as_):
        self.k = k
        self.answer = 0
        self.isCalculate = False
        self.lists = [[] for _ in range(n)]
        for i in range(n):
            j = as_[i]
            if 0 < i:
                self.lists[j].append(i)
            elif 0 < j:
                self.answer += 1

    def calculate(self):
        if not self.isCalculate:
            self.dfs(0, 0)
            self.isCalculate = True
        return self.answer

    def dfs(self, a, pre):
        h = 0
        for i in self.lists[a]:
            h = max(h, self.dfs(i, a))
        if 0 < pre and h == self.k - 1:
            h = 0
            self.answer += 1
        else:
            h += 1
        return h

