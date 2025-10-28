
import sys
sys.setrecursionlimit(10**6)

class Calculator:
    def __init__(self, n, k, as_list):
        self.k = k
        self.answer = 0
        self.lists = [[] for _ in range(n)]
        for i in range(n):
            j = as_list[i]
            if i > 0:
                self.lists[j].append(i)
            elif j > 0:
                self.answer += 1

    def dfs(self, a, pre):
        h = 0
        for i in self.lists[a]:
            h = max(h, self.dfs(i, a))
        if pre > 0 and h == self.k - 1:
            self.answer += 1
            h = 0
        else:
            h += 1
        return h

    def calculate(self):
        self.dfs(0, 0)
        return self.answer

def main():
    n, k = map(int, input().split())
    as_list = list(map(lambda x: int(x) - 1, input().split()))
    calculator = Calculator(n, k, as_list)
    print(calculator.calculate())

if __name__ == "__main__":
    main()

