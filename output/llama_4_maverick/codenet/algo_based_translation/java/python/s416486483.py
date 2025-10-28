
import sys

class Main:
    @staticmethod
    def split(n, k):
        sum_val = 0
        while n > 0:
            sum_val += n % k
            n //= k
        return sum_val

    @staticmethod
    def solve(n, s):
        k = 2
        for k in range(2, int(n**0.5) + 1 if n >= 10000 else 100):
            if Main.split(n, k) == s:
                return k
        k += 1
        while k <= n:
            a = n // k
            b = n % k
            if (a + b - s) % a == 0:
                dk = (a + b - s) // a
                if dk >= 0 and b - dk * a >= 0:
                    return k + dk
            k = n // a + 1
        if n == s:
            return n + 1
        return -1

    @staticmethod
    def main():
        nl, sl = map(int, sys.stdin.readline().split())
        print(Main.solve(nl, sl))

if __name__ == "__main__":
    Main.main()

