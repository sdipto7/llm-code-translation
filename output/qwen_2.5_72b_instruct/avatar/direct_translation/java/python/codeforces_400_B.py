import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
m = int(data[1])
arrs = data[2:]
length = []
index = 0
returnDex = 0
for tmp in arrs:
    dexG = tmp.find("G")
    dexS = tmp.find("S")
    if dexG > dexS:
        returnDex = -1
    length.append(dexS - dexG)
set_length = set(length)
if returnDex == -1:
    print(returnDex)
else:
    print(len(set_length))
