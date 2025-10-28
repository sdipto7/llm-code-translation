
import sys

num = int(sys.stdin.readline().strip())
n = int(sys.stdin.readline().strip())
ai = []
bi = []
for _ in range(n):
    a, b = map(int, sys.stdin.readline().strip().split())
    ai.append(a)
    bi.append(b)
ai.sort()
bi.sort()
if n % 2 == 1:
    print(bi[n // 2] - ai[n // 2] + 1)
else:
    b = (ai[n // 2 - 1] + ai[n // 2]) / 2
    c = (bi[n // 2 - 1] + bi[n // 2]) / 2
    print(int((c - b) * 2 + 1))
sys.stdout.flush()

