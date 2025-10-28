
import math
from decimal import Decimal

def main():
    sc = input().split()
    A = int(sc[0])
    B = int(sc[1])
    H = int(sc[2])
    M = int(sc[3])
    AA = Decimal(A)
    BB = Decimal(B)
    HH = Decimal(H)
    MM = Decimal(M)
    mkaku = MM * Decimal(6)
    hkaku = HH * Decimal(30)
    hkaku = hkaku + Decimal(M / 2)
    kaku = mkaku - hkaku
    dkaku = abs(math.radians(float(kaku)))
    AA2 = AA * AA
    BB2 = BB * BB
    CC = AA2 + BB2
    DD = Decimal(math.cos(dkaku))
    DD = DD * Decimal(2)
    DD = DD * AA
    DD = DD * BB
    ans2 = CC - DD
    dans2 = float(ans2)
    ans = math.sqrt(dans2)
    print(ans)

main()

