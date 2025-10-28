
import sys

Q = int(sys.stdin.readline())
H = int(sys.stdin.readline())
S = int(sys.stdin.readline())
D = int(sys.stdin.readline())
N = int(sys.stdin.readline())

onePrice = min(Q * 4, H * 2, S)
if onePrice <= D / 2:
    print(N * onePrice)
else:
    print((N // 2) * D + (N % 2) * onePrice)

