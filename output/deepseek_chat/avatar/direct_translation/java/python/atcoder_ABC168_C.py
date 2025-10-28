
import math
from decimal import Decimal

A = int(input())
B = int(input())
H = int(input())
M = int(input())

AA = Decimal(A)
BB = Decimal(B)
HH = Decimal(H)
MM = Decimal(M)

mkaku = MM * Decimal(6)
hkaku = HH * Decimal(30)
hkaku += Decimal(float(M) / 2)
kaku = mkaku - hkaku
dkaku = abs(math.radians(float(kaku)))

AA2 = AA * AA
BB2 = BB * BB
CC = AA2 + BB2
DD = Decimal(math.cos(dkaku))
DD *= Decimal(2)
DD *= AA
DD *= BB
ans2 = CC - DD
dans2 = float(ans2)
ans = math.sqrt(dans2)

print(ans)

