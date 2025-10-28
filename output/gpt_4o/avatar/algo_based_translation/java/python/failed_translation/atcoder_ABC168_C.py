
import math
from decimal import Decimal, getcontext

def main():
    getcontext().prec = 50  # Set precision for Decimal calculations

    # Input operations
    A = int(input())
    B = int(input())
    H = int(input())
    M = int(input())

    # Convert to Decimal
    AA = Decimal(A)
    BB = Decimal(B)
    HH = Decimal(H)
    MM = Decimal(M)

    # Calculations
    mkaku = MM * 6
    hkaku = HH * 30 + (Decimal(M) / 2)
    kaku = mkaku - hkaku
    dkaku = math.radians(abs(kaku))

    AA2 = AA * AA
    BB2 = BB * BB
    CC = AA2 + BB2
    DD = 2 * math.cos(dkaku) * AA * BB
    ans2 = CC - DD
    dans2 = float(ans2)
    ans = math.sqrt(dans2)

    # Output result
    print(ans)

if __name__ == "__main__":
    main()

