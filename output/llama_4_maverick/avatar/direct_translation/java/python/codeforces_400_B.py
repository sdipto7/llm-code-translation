
n, m = map(int, input().split())
arrs = [input() for _ in range(n)]
length = []
returnDex = 0
for tmp in arrs:
    dexG = tmp.find('G')
    dexS = tmp.find('S')
    if dexG > dexS:
        returnDex = -1
    length.append(dexS - dexG)
set_len = set(length)
if returnDex == -1:
    print(returnDex)
else:
    print(len(set_len))

