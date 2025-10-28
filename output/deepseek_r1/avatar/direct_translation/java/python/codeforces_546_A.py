pandu, vundu, urdu = map(int, input().split())
c = 0
for i in range(1, urdu + 1):
    c += i * pandu
print(0 if c < vundu else c - vundu)
