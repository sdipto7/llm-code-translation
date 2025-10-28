
import sys
import bisect

class Main:
    def __init__(self):
        input = sys.stdin.read
        data = input().split()
        index = 0
        a = int(data[index]); index += 1
        b = int(data[index]); index += 1
        q = int(data[index]); index += 1
        s = [-10_000_000_000] + [int(data[index + i]) for i in range(a)] + [20_000_000_000]
        index += a
        t = [-10_000_000_000] + [int(data[index + i]) for i in range(b)] + [20_000_000_000]
        index += b
        results = []
        for _ in range(q):
            x = int(data[index]); index += 1
            sl = x - s[max(0, bisect.bisect_right(s, x) - 1)]
            tl = x - t[max(0, bisect.bisect_right(t, x) - 1)]
            sr = s[bisect.bisect_left(s, x)] - x
            tr = t[bisect.bisect_left(t, x)] - x
            result = min(
                max(sl, tl),
                max(sr, tr),
                2 * sl + tr,
                2 * tl + sr,
                sl + 2 * tr,
                tl + 2 * sr
            )
            results.append(result)
        sys.stdout.write('\n'.join(map(str, results)) + '\n')

if __name__ == "__main__":
    Main()

