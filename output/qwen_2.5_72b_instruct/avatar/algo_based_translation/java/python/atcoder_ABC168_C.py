from decimal import Decimal
import math

def main():
    A = int(input())
    B = int(input())
    H = int(input())
    M = int(input())
    
    AA = Decimal(A)
    BB = Decimal(B)
    HH = Decimal(H)
    MM = Decimal(M)
    
    mkaku = MM * Decimal(6)
    hkaku = HH * Decimal(30) + MM / Decimal(2)
    kaku = mkaku - hkaku
    dkaku = abs(math.radians(float(kaku)))
    
    AA2 = AA * AA
    BB2 = BB * BB
    CC = AA2 + BB2
    DD = Decimal(2) * AA * BB * Decimal(math.cos(dkaku))
    ans2 = CC - DD
    dans2 = float(ans2)
    ans = math.sqrt(dans2)
    
    print(ans)

if __name__ == "__main__":
    main()
