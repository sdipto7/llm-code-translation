
import sys
from threading import Thread
from collections import defaultdict

class MyRunnable:
    def run(self):
        n, k = map(int, sys.stdin.readline().split())
        as_list = list(map(lambda x: int(x) - 1, sys.stdin.readline().split()))
        print(Calculator(n, k, as_list).calculate())

class Calculator:
    def __init__(self, n, k, as_list):
        self.k = k
        self.answer = 0
        self.is_calculate = False
        self.lists = defaultdict(list)
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

if __name__ == "__main__":
    sys.setrecursionlimit(10**6)
    thread = Thread(target=MyRunnable().run)
    thread.start()
    thread.join()

