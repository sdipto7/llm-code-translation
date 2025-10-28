
import sys

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
    a_med = ai[len(ai) // 2]
    b_med = bi[len(bi) // 2]
    print(b_med - a_med + 1)
else:
    a_avg = (ai[n//2 - 1] + ai[n//2]) / 2
    b_avg = (bi[n//2 - 1] + bi[n//2]) / 2
    print(int(2 * (b_avg - a_avg) + 1))

