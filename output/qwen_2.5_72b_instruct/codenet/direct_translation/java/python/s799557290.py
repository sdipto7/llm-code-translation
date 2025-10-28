
import sys

input = sys.stdin.read
data = input().split()

a = int(data[0])
b = int(data[1])
ju = [False] * 100001
pe = [0] * 100001
wa = 0
ac = 0
index = 2

for _ in range(b):
    n = int(data[index]) - 1
    res = data[index + 1]
    index += 2
    
    if res == "WA" and not ju[n]:
        pe[n] += 1
    
    if res == "AC":
        ju[n] = True

for i in range(a):
    if ju[i]:
        ac += 1
        wa += pe[i]

print(ac, wa)

