
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
result = 0
h = [int(data[2*i+1]) for i in range(n)]
g = [int(data[2*i+2]) for i in range(n)]
for i in range(n):
    for j in range(n):
        if h[i] == g[j]:
            result += 1
print(result)

