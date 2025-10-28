
import sys
from threading import Thread

class Calculator:
    def __init__(self, n, k, as_list):
        self.k = k
        self.answer = 0
        self.is_calculate = False
        self.lists = [[] for _ in range(n)]
        for i in range(n):
            j = as_list[i]
            if i > 0:
                self.lists[j].append(i)
            elif j > 0:
                self.answer += 1

    def calculate(self):
        if not self.is_calculate:
            self.dfs(0, 0)
            self.is_calculate = True
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

class MyRunnable:
    def __init__(self):
        self.n = None
        self.k = None
        self.as_list = None

    def run(self):
        self.n, self.k = map(int, sys.stdin.readline().split())
        self.as_list = [int(sys.stdin.readline().split()[0]) - 1 for _ in range(self.n)]
        calculator = Calculator(self.n, self.k, self.as_list)
        print(calculator.calculate())

def main():
    sys.setrecursionlimit(1 << 30)
    thread = Thread(target=MyRunnable().run)
    thread.stack_size = 1 << 26
    thread.start()
    thread.join()

if __name__ == "__main__":
    main()

