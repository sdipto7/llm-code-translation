
class AtCoderABC167D:
    def __init__(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        self.N = int(data[0])
        self.K = int(data[1])
        self.A = list(map(lambda x: int(x) - 1, data[2:2+self.N]))
    
    def do_it(self):
        N, K, A = self.N, self.K, self.A
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
    AtCoderABC167D().do_it()

