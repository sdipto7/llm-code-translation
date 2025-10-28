
import sys

class Printer:
    def __init__(self, output_stream):
        self.output_stream = output_stream

    def println(self, value):
        self.output_stream.write(str(value) + '\n')

    def close(self):
        self.output_stream.flush()

def solve(sc, pr):
    n, k = map(int, sc.readline().split())
    a = list(map(int, sc.readline().split()))

    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]

    b = []
    max_sum = 0
    for i in range(n):
        for j in range(i, n):
            subarray_sum = cumsum[j + 1] - cumsum[i]
            b.append(subarray_sum)
            max_sum = max(max_sum, subarray_sum)

    mask = 1 << (max_sum.bit_length() - 1) if max_sum != 0 else 0
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

def main():
    sc = sys.stdin
    pr = Printer(sys.stdout)
    solve(sc, pr)
    pr.close()

if __name__ == "__main__":
    main()

