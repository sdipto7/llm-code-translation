
n, m = map(int, input().split())
arrs = [input() for _ in range(n)]
length = [0] * n
returnDex = 0
for i, tmp in enumerate(arrs):
    dexG = tmp.find('G')
    dexS = tmp.find('S')
    if dexG > dexS:
        returnDex = -1
    length[i] = dexS - dexG
set_ = set(length)
if returnDex == -1:
    print(returnDex)
else:
    print(len(set_))

