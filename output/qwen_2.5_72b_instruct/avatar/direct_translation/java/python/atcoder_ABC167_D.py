
import sys

MOD = 1000000007
MAX = sys.maxsize
LMAX = sys.maxsize
len = int(1e6) + 1

def doIt():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    K = int(input[1])
    A = list(map(lambda x: int(x) - 1, input[2:]))
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
    doIt()

