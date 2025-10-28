
import sys
sys.setrecursionlimit(300000)

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    as_list = [int(x) - 1 for x in data[2:2+n]]
    
    calculator = Calculator(n, k, as_list)
    result = calculator.calculate()
    print(result)

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
        for child in self.lists[a]:
            h = max(h, self.dfs(child, a))
        
        if pre > 0 and h == self.k - 1:
            h = 0
            self.answer += 1
        else:
            h += 1
        
        return h

if __name__ == '__main__':
    main()

