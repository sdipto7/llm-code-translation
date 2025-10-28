import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.pr = sys.stdout

    def solve(self):
        import sys
        import sys
        import sys
        n = int(self.sc.readline())
        k = int(self.sc.readline())
        a = list(map(int, self.sc.readline().split()))
        cumsum = [0] * (n + 1)
        for i in range(n):
            cumsum[i + 1] = cumsum[i] + a[i]
        b = []
        max_val = 0
        for i in range(n):
            for j in range(i, n):
                diff = cumsum[j + 1] - cumsum[i]
                b.append(diff)
                max_val = max(max_val, diff)
        mask = 1 << (max_val.bit_length() - 1)
        while mask > 0:
            tmp = [e for e in b if e & mask]
            if len(tmp) >= k:
                b = tmp
            mask >>= 1
        if len(b) < k:
            self.pr.write('0\n')
        else:
            ans = b[0]
            for e in b:
                ans &= e
            self.pr.write(f'{ans}\n')

    def main(self):
        self.solve()
        self.pr.flush()

if __name__ == '__main__':
    main = Main()
    main.main()
