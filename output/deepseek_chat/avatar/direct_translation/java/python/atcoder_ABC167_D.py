
import sys

MOD = 1000000007
MAX = sys.maxsize
LMAX = sys.maxsize

def doIt():
    sc = sys.stdin
    N, K = int(sc.readline()), int(sc.readline())
    A = list(map(int, sc.readline().split()))
    A = [a - 1 for a in A]
    used = set()
    idx = [0] * N
    pos = [0] * N
    next_, cur = 0, 0
    while next_ not in used:
        used.add(next_)
        idx[next_] = cur
        pos[cur] = next_
        next_ = A[next_]
        cur += 1
    a = cur - idx[next_]
    b = idx[next_]
    ans = (10000 * a + K - b) % a + b
    if b > K:
        ans = K
    print(pos[ans] + 1)

if __name__ == "__main__":
    doIt()

