
from decimal import Decimal, getcontext

def main():
    N, d, x = map(float, input().split())
    ans = Decimal('0.0')
    getcontext().prec = 30
    while N > 0.5:
        adnum = Decimal(str(d + x * (N - 0.5)))
        ans = ans + adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1
    print(format(ans, '.20f'))

if __name__ == "__main__":
    main()

