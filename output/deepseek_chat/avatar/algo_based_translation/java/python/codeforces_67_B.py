
import sys

class codeforces_67_B:
    def __init__(self):
        self.sc = sys.stdin
    
    def main(self):
        n = int(self.sc.readline())
        k = int(self.sc.readline())
        bb = [0] * n
        for i in range(n):
            bb[i] = int(self.sc.readline())
        
        aa = [0] * n
        m = 0
        
        for a in range(n - 1, -1, -1):
            j = 0
            while bb[a] > 0:
                if j < m and aa[j] >= a + k:
                    bb[a] -= 1
                j += 1
            for j_ in range(m, j, -1):
                aa[j_] = aa[j_ - 1]
            aa[j] = a
            m += 1
        
        for i in range(n):
            print(aa[i] + 1, end=" ")
        print()

def main():
    o = codeforces_67_B()
    o.main()

if __name__ == "__main__":
    main()

