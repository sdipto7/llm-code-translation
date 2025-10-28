
import sys
from threading import Thread

class MyRunnable:
    def run(self):
        n, k = map(int, sys.stdin.readline().strip().split())
        as_list = [int(sys.stdin.readline().strip()) - 1 for _ in range(n)]
        calculator = Calculator(n, k, as_list)
        print(calculator.calculate())

class Calculator:
    def __init__(self, n, k, as_list):
        self.k = k
        self.answer = 0
        self.isCalculate = False
        self.lists = [[] for _ in range(n)]

        for i in range(n):
            j = as_list[i]
            if i > 0:
                self.lists[j].append(i)
            elif j > 0:
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
        if pre > 0 and h == self.k - 1:
            h = 0
            self.answer += 1
        else:
            h += 1
        return h

if __name__ == "__main__":
    thread = Thread(target=MyRunnable().run)
    thread.start()
    thread.join()

