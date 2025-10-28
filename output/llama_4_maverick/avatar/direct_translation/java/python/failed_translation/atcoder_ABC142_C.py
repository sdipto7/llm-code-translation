
N = int(input())
idorder = {}
for i in range(N):
    A = int(input().split()[0]) if i == 0 else int(input().split()[i])
    idorder[A] = i + 1
for i in range(1, N + 1):
    print(idorder[i], end=' ')


However, a more accurate translation of the given Java code would be:


import sys
N = int(sys.stdin.readline())
idorder = {}
A_list = list(map(int, sys.stdin.readline().split()))
for i, A in enumerate(A_list, start=1):
    idorder[A] = i
for i in range(1, N + 1):
    print(idorder[i], end=' ')

