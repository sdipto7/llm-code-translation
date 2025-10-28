
import sys
from collections import HashSet

class AtcoderABC167D:
    def __init__(self):
        self.sc = sys.stdin
        self.MOD = 1000000007
        self.MAX = sys.maxsize
        self.LMAX = sys.maxsize
        self.len = 1000001

    def doIt(self):
        N = int(self.sc.readline())
        K = int(self.sc.readline())
        A = list(map(int, self.sc.readline().split()))
        A = [x - 1 for x in A]
        used = set()
        idx = [0] * N
        pos = [0] * N
        next = 0
        cur = 0
        while next not in used:
            used.add(next)
            idx[next] = cur
            pos[cur] = next
            next = A[next]
            cur += 1
        a = cur - idx[next]
        b = idx[next]
        ans = (10000 * a + K - b) % a + b
        if b > K:
            ans = K
        print(pos[ans] + 1)

if __name__ == "__main__":
    atcoder_ABC167_D = AtcoderABC167D()
    atcoder_ABC167_D.doIt()

