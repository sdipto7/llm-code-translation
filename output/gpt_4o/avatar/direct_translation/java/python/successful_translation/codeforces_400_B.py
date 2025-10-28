
n, m = map(int, input().split())
arrs = [input() for _ in range(n)]
length = [0] * n
index = 0
returnDex = 0
for tmp in arrs:
    dexG = tmp.index("G")
    dexS = tmp.index("S")
    if dexG > dexS:
        returnDex = -1
    length[index] = dexS - dexG
    index += 1
unique_lengths = set(length)
if returnDex == -1:
    print(returnDex)
else:
    print(len(unique_lengths))

