
pandu, vundu, urdu = map(int, input().split())
c = (urdu * (urdu + 1)) // 2 * pandu
print(max(0, c - vundu))

