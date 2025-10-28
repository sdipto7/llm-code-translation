
import sys
import math
from typing import List, Tuple

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.max = 0
        self.cur = 0
    
    def solve(self):
        a = self.ni()
        b = self.ni()
        print(max(0, a - 2 * b))
    
    def ni(self):
        return int(input().strip())
    
    def nl(self):
        return int(input().strip())
    
    def nf(self):
        return float(input().strip())
    
    def nd(self):
        return float(input().strip())
    
    def ns(self):
        return input().strip()
    
    def nst(self, s):
        return s.split()
    
    def ia(self, a):
        for i in range(len(a)):
            a[i] = int(input().strip())
    
    def la(self, a):
        for i in range(len(a)):
            a[i] = int(input().strip())
    
    def fa(self, a):
        for i in range(len(a)):
            a[i] = float(input().strip())
    
    def da(self, a):
        for i in range(len(a)):
            a[i] = float(input().strip())
    
    def sa(self, a, empty):
        if empty:
            for i in range(len(a)):
                a[i] = ""
        else:
            for i in range(len(a)):
                a[i] = input().strip()
    
    def ida(self, a, n, m):
        for i in range(n):
            for j in range(m):
                a[i][j] = int(input().strip())
    
    def lda(self, a, n, m):
        for i in range(n):
            for j in range(m):
                a[i][j] = int(input().strip())
    
    def dda(self, a, n, m):
        for i in range(n):
            for j in range(m):
                a[i][j] = float(input().strip())
    
    def stoi(self, s):
        return int(s)
    
    def stod(self, s):
        return float(s)
    
    def lmin(self, a):
        return min(a)
    
    def imin(self, a):
        return min(a)
    
    def lmax(self, a):
        return max(a)
    
    def imax(self, a):
        return max(a)
    
    def ibs(self, a, toFind):
        a_sorted = sorted(a)
        min_idx = 0
        max_idx = len(a_sorted) - 1
        found = False
        
        while min_idx <= max_idx and not found:
            mid = min_idx + (max_idx - min_idx) // 2
            if a_sorted[mid] == toFind:
                found = True
            elif toFind > a_sorted[mid]:
                min_idx = mid + 1
            else:
                max_idx = mid - 1
        
        return found
    
    def lbs(self, a, toFind):
        a_sorted = sorted(a)
        min_idx = 0
        max_idx = len(a_sorted) - 1
        found = False
        
        while min_idx <= max_idx and not found:
            mid = min_idx + (max_idx - min_idx) // 2
            if a_sorted[mid] == toFind:
                found = True
            elif toFind > a_sorted[mid]:
                min_idx = mid + 1
            else:
                max_idx = mid - 1
        
        return found
    
    def stb(self, s):
        sum_val = 0
        k = 0
        for i in range(len(s)-1, -1, -1):
            sum_val += int(s[i]) * (2 ** k)
            k += 1
        return sum_val

if __name__ == "__main__":
    main = Main()
    main.solve()

