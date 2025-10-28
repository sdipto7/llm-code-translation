
import math

def main():
    n, m = map(int, input().split())
    gcd = math.gcd(n, m)
    s = input()
    t = input()
    result = next((k for k in range(gcd) if s[k * n // gcd] != t[k * m // gcd]), None)
    if result is not None:
        print(-1)
    else:
        lcm = n * m // gcd
        print(lcm)

if __name__ == "__main__":
    main()

