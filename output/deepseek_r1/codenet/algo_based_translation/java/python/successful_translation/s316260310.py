
import sys
import sys
from sys import stdin

class Helper:
    def __init__(self):
        self.data = sys.stdin.read().split()
        self.ptr = 0
    
    def next_int(self):
        res = int(self.data[self.ptr])
        self.ptr += 1
        return res
    
    def next_long(self):
        return self.next_int()
    
    def get_int_array(self, n):
        arr = list(map(int, self.data[self.ptr:self.ptr+n]))
        self.ptr += n
        return arr

class Solver:
    def __init__(self):
        self.hp = Helper()
        self.TESTCASES = False
    
    def solve(self):
        tc = 1
        if self.TESTCASES:
            tc = self.hp.next_int()
        for _ in range(tc):
            self.solve_case()
    
    def solve_case(self):
        N = self.hp.next_int()
        K = self.hp.next_long()
        A = self.hp.get_int_array(N)
        
        vis = [False] * N
        curr = 0
        while not vis[curr]:
            vis[curr] = True
            curr = A[curr] - 1
        
        straight = []
        st = 0
        while st != curr:
            straight.append(st)
            st = A[st] - 1
        
        cycle = [curr]
        curr = A[curr] - 1
        while curr != cycle[0]:
            cycle.append(curr)
            curr = A[curr] - 1
        
        if K < len(straight):
            print(straight[K] + 1)
        else:
            K -= len(straight)
            print(cycle[K % len(cycle)] + 1)

def main():
    Solver().solve()

if __name__ == "__main__":
    main()

