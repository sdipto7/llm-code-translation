
import sys

n = int(input().strip())
vStr = input().strip()
vList = {i: int(val) for i, val in enumerate(vStr.split())}
cStr = input().strip()
cList = {i: int(val) for i, val in enumerate(cStr.split())}
max_profit = 0
for i in range(n):
    profit = vList[i] - cList[i]
    if profit > 0:
        max_profit += profit
print(max_profit)

