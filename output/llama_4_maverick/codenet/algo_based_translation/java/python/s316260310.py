
import sys
import random
from collections import defaultdict

class Helper:
    def __init__(self, mod, maxn):
        self.MOD = mod
        self.MAXN = maxn
        self.rnd = random.Random()

    def get_int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def get_long_array(self, size):
        return [self.next_long() for _ in range(size)]

    def get_string_array(self, size):
        return [self.next() for _ in range(size)]

    def join_elements(self, *ar):
        return ' '.join(map(str, ar))

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def sum(self, *ar):
        return sum(ar)

    def shuffle(self, ar):
        random.shuffle(ar)

    def reverse(self, ar):
        ar.reverse()

    def pow(self, base, exp, mod):
        return pow(base, exp, mod)

    def next(self):
        return sys.stdin.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def print(self, *args, end=' '):
        print(*args, end=end)

    def println(self, *args, end='\n'):
        print(*args, end=end)

    def flush(self):
        sys.stdout.flush()


class Solver:
    def __init__(self):
        self.hp = Helper(10**9 + 7, 10**6)
        self.MAXN = 10**6
        self.MOD = 10**9 + 7

    def solve(self):
        try:
            tc = 1 if not hasattr(self, 'TESTCASES') or not self.TESTCASES else self.hp.next_int()
            for tce in range(1, tc + 1):
                self.solve_test_case(tce)
        except Exception as e:
            raise e
        finally:
            self.hp.flush()

    def solve_test_case(self, tc):
        N = self.hp.next_int()
        K = self.hp.next_long()
        A = self.hp.get_int_array(N)

        vis = [False] * N
        straight = []
        cycle = []
        curr = 0
        while not vis[curr]:
            vis[curr] = True
            curr = A[curr] - 1

        st = 0
        while st != curr:
            straight.append(st + 1)
            st = A[st] - 1

        cycle.append(curr + 1)
        curr = A[curr] - 1
        while curr + 1 != cycle[0]:
            cycle.append(curr + 1)
            curr = A[curr] - 1

        if K < len(straight):
            self.hp.println(straight[int(K)])
        else:
            K -= len(straight)
            self.hp.println(cycle[int(K % len(cycle))])


def main():
    try:
        solver = Solver()
        solver.solve()
    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(1)
    sys.exit(0)


if __name__ == '__main__':
    main()

