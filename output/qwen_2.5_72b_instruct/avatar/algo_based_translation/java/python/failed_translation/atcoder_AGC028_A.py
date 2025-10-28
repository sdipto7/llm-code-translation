import math
from fractions import gcd

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    m = int(input[1])
    s = input[2]
    t = input[3]
    gcd_value = gcd(n, m)
    lcm_value = n * m // gcd_value
    for k in range(gcd_value):
        if s[k * n // gcd_value] != t[k * m // gcd_value]:
            print(-1)
            return
    print(lcm_value)

if __name__ == "__main__":
    main()
