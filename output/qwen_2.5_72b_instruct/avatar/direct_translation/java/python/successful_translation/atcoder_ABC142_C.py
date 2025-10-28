
import sys

input = sys.stdin.read().split()
N = int(input[0])
idorder = {}
for i in range(1, N + 1):
    A = int(input[i])
    idorder[A] = i
for i in range(1, N + 1):
    print(idorder[i], end=' ')

