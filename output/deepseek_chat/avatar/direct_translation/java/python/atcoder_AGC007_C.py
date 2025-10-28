
import sys
import decimal

def main():
    input = sys.stdin.read
    data = input().split()
    N = float(data[0])
    d = float(data[1])
    x = float(data[2])
    ans = decimal.Decimal('0.0')
    while N > 0.5:
        adnum = decimal.Decimal(str(d + x * (N - 0.5)))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1
    print("{0:.20f}".format(ans))

if __name__ == "__main__":
    main()

