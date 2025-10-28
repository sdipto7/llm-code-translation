
import math
from functools import reduce

def main():
    n, m = map(int, input().split())
    gcd = math.gcd(n, m)
    s = input()
    t = input()
    result = next((k for k in range(gcd) if s[k * n // gcd] != t[k * m // gcd]), None)
    if result is not None:
        print(-1)
    else:
        print(n * m // gcd)

if __name__ == "__main__":
    main()

