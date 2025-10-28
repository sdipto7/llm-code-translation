
import math

def main():
    A, B, H, M = map(int, input().split())
    mkaku = M * 6
    hkaku = H * 30 + M / 2
    kaku = abs(mkaku - hkaku)
    dkaku = math.radians(kaku)
    ans = math.sqrt(A**2 + B**2 - 2*A*B*math.cos(dkaku))
    print(ans)

if __name__ == "__main__":
    main()

