
from decimal import Decimal
import math

A = int(input())
B = int(input())
H = int(input())
M = int(input())

AA = Decimal(A)
BB = Decimal(B)
HH = Decimal(H)
MM = Decimal(M)

mkaku = MM * Decimal(6)
hkaku = HH * Decimal(30) + Decimal(M) / Decimal(2)
kaku = mkaku - hkaku
dkaku = math.radians(abs(float(kaku)))

AA2 = AA ** 2
BB2 = BB ** 2
CC = AA2 + BB2
cos_term = Decimal(math.cos(dkaku))
DD = Decimal(2) * AA * BB * cos_term
ans2 = CC - DD
dans2 = float(ans2)
ans = math.sqrt(dans2)

print(ans)

