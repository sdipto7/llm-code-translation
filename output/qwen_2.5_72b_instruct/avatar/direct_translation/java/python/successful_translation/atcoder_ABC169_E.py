
num = 998244353
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
ai = [int(data[i * 2 + 1]) for i in range(n)]
bi = [int(data[i * 2 + 2]) for i in range(n)]
ai.sort()
bi.sort()
if n % 2 == 1:
    print(bi[n // 2] - ai[n // 2] + 1)
else:
    b = (ai[n // 2] + ai[n // 2 - 1]) / 2
    c = (bi[n // 2] + bi[n // 2 - 1]) / 2
    print(int(2 * (c - b) + 1))

