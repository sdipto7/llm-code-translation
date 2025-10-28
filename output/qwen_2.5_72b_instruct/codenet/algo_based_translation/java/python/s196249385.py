
import sys

class Printer:
    def __init__(self, out):
        self.out = out

    def println(self, value):
        self.out.write(f"{value}\n")

def solve(sc, pr):
    n = int(next(sc))
    k = int(next(sc))

    a = [0] * n
    for i in range(n):
        a[i] = int(next(sc))

    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]

    b = []
    max_val = 0
    for i in range(n):
        for j in range(i, n):
            subarray_sum = cumsum[j + 1] - cumsum[i]
            b.append(subarray_sum)
            max_val = max(max_val, subarray_sum)

    mask = 1 << (max_val.bit_length() - 1)
    while mask > 0:
        tmp = []
        for e in b:
            if e & mask != 0:
                tmp.append(e)
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

def main():
    sc = iter(sys.stdin.read().split())
    pr = Printer(sys.stdout)
    solve(sc, pr)
    pr.out.flush()

if __name__ == "__main__":
    main()

