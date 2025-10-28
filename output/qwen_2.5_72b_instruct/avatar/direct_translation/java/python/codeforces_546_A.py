
import sys

sc = sys.stdin.read().split()
pandu = int(sc[0])
vundu = int(sc[1])
urdu = int(sc[2])
c = 0
for i in range(1, urdu + 1):
    c += i * pandu
if c < vundu:
    print("0")
else:
    print(c - vundu)

