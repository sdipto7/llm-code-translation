import sys
from threading import Thread

class MyRunnable:
    def run(self):
        import sys
        input = sys.stdin.read().split()
        n = int(input[0])
        k = int(input[1])
        as_ = [int(x) - 1 for x in input[2:]]
        calculator = Calculator(n, k, as_)
        print(calculator.calculate())

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

if __name__ == "__main__":
    Thread(target=MyRunnable().run).start()
