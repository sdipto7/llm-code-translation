
import math

def main():
    A, B, H, M = map(int, input().split())
    mkaku = M * 6
    hkaku = H * 30 + M / 2
    kaku = mkaku - hkaku
    dkaku = abs(math.radians(kaku))
    AA2 = A ** 2
    BB2 = B ** 2
    CC = AA2 + BB2
    DD = 2 * A * B * math.cos(dkaku)
    ans2 = CC - DD
    ans = math.sqrt(ans2)
    print(ans)

if __name__ == "__main__":
    main()

