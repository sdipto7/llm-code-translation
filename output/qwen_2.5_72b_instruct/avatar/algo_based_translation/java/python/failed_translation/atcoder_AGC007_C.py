
from decimal import Decimal, getcontext
import sys

def main():
    getcontext().prec = 50
    input = sys.stdin.read().split()
    N = float(input[0])
    d = float(input[1])
    x = float(input[2])
    ans = Decimal('0.0')
    while N > 0.5:
        adnum = Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1.0
    print(f"{ans:.20f}")

if __name__ == "__main__":
    main()

