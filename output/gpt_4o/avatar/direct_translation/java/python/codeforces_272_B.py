
import sys
from collections import defaultdict

class FastReader:
    def __init__(self):
        self.data = sys.stdin.read().split()
        self.index = 0
    
    def next(self):
        val = self.data[self.index]
        self.index += 1
        return val
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if (x & (1 << k)) != 0:
            answer += 1
    return answer

sc = FastReader()
n = sc.nextInt()
a = [0] * 33
for i in range(n):
    a[rec(sc.nextInt())] += 1

answer = 0
for i in range(len(a)):
    summ = (1 + a[i] - 1) / 2.0 * (a[i] - 1)
    answer += summ

print(int(answer))

