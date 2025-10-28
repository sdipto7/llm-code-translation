
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
a_list = data[1:n+1]

idorder = {}
for idx in range(n):
    a = a_list[idx]
    idorder[a] = idx + 1

result = []
for i in range(1, n+1):
    result.append(str(idorder[i]))

print(' '.join(result))

