
import sys
from math import gcd

def main():
    input_data = sys.stdin.read().split()
    n = int(input_data[0])
    m = int(input_data[1])
    s = input_data[2]
    t = input_data[3]

    gcd_value = gcd(n, m)

    for k in range(gcd_value):
        index_s = k * n // gcd_value
        index_t = k * m // gcd_value
        if s[index_s] != t[index_t]:
            print(-1)
            return

    result = (n * m) // gcd_value
    print(result)

if __name__ == "__main__":
    main()

