
import sys

class Printer:
    def __init__(self, out):
        self.out = out

    def println(self, s):
        self.out.write(str(s) + '\n')

    def close(self):
        self.out.flush()

def main():
    sc = sys.stdin
    pr = Printer(sys.stdout)

    n = int(sc.readline().split()[0])
    k = int(sc.readline().split()[0])

    a = list(map(int, sc.readline().split()))

    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]

    b = []
    max_val = 0
    for i in range(n):
        for j in range(i, n):
            val = cumsum[j + 1] - cumsum[i]
            b.append(val)
            max_val = max(max_val, val)

    mask = 1 << max_val.bit_length() - 1
    while mask > 0:
        tmp = [e for e in b if e & mask != 0]
        if len(tmp) >= k:
            b = tmp
        mask >>= 1

    if len(b) < k:
        pr.println(0)
    else:
        ans = -1
        for e in b:
            ans &= e
        pr.println(ans)

    pr.close()

if __name__ == "__main__":
    main()

