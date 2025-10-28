
import sys
import math

n = int(sys.stdin.readline())
ai = []
bi = []
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    ai.append(a)
    bi.append(b)
ai.sort()
bi.sort()
if n % 2 == 1:
    print(bi[len(bi) // 2] - ai[len(ai) // 2] + 1)
else:
    b = (ai[len(ai) // 2] + ai[len(ai) // 2 - 1]) / 2
    c = (bi[len(bi) // 2] + bi[len(bi) // 2 - 1]) / 2
    print(int(2 * (c - b) + 1))

